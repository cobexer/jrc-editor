/*
 * Copyright (C) 2001-2002  Zaval Creative Engineering Group (http://www.zaval.org)
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

package org.zaval.xml;

/*
 * This code based upon NanoXML 2.2 sources
 */

public class XmlParseException extends RuntimeException {
	public static final int NO_LINE = -1;
	private int lineNr;

	public XmlParseException(String name, String message) {
		super("XML Parse Exception during parsing of "
			+ ((name == null) ? "the XML definition" : ("a " + name + " element"))
			+ ": "
			+ message);
		this.lineNr = NO_LINE;
	}

	public XmlParseException(String name, int lineNr, String message) {
		super("XML Parse Exception during parsing of "
			+ ((name == null) ? "the XML definition" : ("a " + name + " element"))
			+ " at line "
			+ lineNr
			+ ": "
			+ message);
		this.lineNr = lineNr;
	}

	public int getLineNr() {
		return this.lineNr;
	}
}
