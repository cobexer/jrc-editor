/*
 * Copyright (C) 2001-2002  Zaval Creative Engineering Group (http://www.zaval.org)
 * Copyright (C) 2019 Christoph Obexer <cobexer@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * (version 2) as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.zaval.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.event.HyperlinkEvent;

@SuppressWarnings("serial")
public class AboutDialog extends JDialog {
	private static final Logger LOGGER = LoggerFactory.getLogger(AboutDialog.class);

	private ActionListener actionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent actionEvent) {
			dispose();
		}
	};

	public AboutDialog(Frame owner, String title, String copyright, String ok, ImageIcon image) {
		super(owner, title, true);
		((JPanel) getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(10, 10));
		JPanel topPanel = new JPanel(new BorderLayout(10, 10));
		JLabel icon = new JLabel(image, JLabel.CENTER);
		JEditorPane copyrightLabel = new JEditorPane("text/html", copyright);
		copyrightLabel.setBackground(icon.getBackground());
		copyrightLabel.setForeground(icon.getForeground());
		copyrightLabel.setEditable(false);
		copyrightLabel.setOpaque(false);
		copyrightLabel.addHyperlinkListener(this::onHyperlinkClicked);
		topPanel.add(icon, BorderLayout.WEST);
		topPanel.add(copyrightLabel, BorderLayout.CENTER);

		JButton okButton = new JButton(ok);
		okButton.addActionListener(e -> dispose());
		add(topPanel, BorderLayout.NORTH);
		add(okButton, BorderLayout.SOUTH);

		KeyStroke stroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
		getRootPane().registerKeyboardAction(actionListener, stroke, JComponent.WHEN_IN_FOCUSED_WINDOW);

		this.pack();
		UiUtils.toCenter(this);
	}

	private void onHyperlinkClicked(HyperlinkEvent e) {
		if (HyperlinkEvent.EventType.ACTIVATED.equals(e.getEventType())) {
			try {
				Desktop.getDesktop().browse(e.getURL().toURI());
			}
			catch (IOException | URISyntaxException e1) {
				LOGGER.error("Failed to open hyperlink {}", e.getURL(), e1);
			}
		}
	}
}
