/**
 *     Caption: Zaval Java Resource Editor
 *     $Revision: 0.37 $
 *     $Date: 2002/03/28 9:24:42 $
 *
 *     @author:     Victor Krapivin
 *     @version:    1.1
 *
 * Zaval JRC Editor is a visual editor which allows you to manipulate 
 * localization strings for all Java based software with appropriate 
 * support embedded.
 * 
 * For more info on this product read Zaval Java Resource Editor User's Guide
 * (It comes within this package).
 * The latest product version is always available from the product's homepage:
 * http://www.zaval.org/products/jrc-editor/
 * and from the SourceForge:
 * http://sourceforge.net/projects/zaval0002/
 *
 * Contacts:
 *   Support : support@zaval.org
 *   Change Requests : change-request@zaval.org
 *   Feedback : feedback@zaval.org
 *   Other : info@zaval.org
 * 
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
 * 
 */
package org.zaval.awt;

import java.awt.*;
import java.awt.image.*;

public class StaticImage
extends Canvas
{
   protected Image image;
   protected int width  = 0;
   protected int height = 0;

   public StaticImage(Image img)
   {
      width = img.getWidth(this);
      height= img.getHeight(this);
      setImage(img);
   }

   public StaticImage(Image img, int w, int h)
   {
      setImage(img,w,h);
   }

   public void setImage(Image img, int width, int height)
   {
      this.image=img;
      this.width=width;
      this.height=height;
      repaint();
   }

   public void setImage(Image img)
   {
      setImage(img,width,height);
   }

   public void paint(Graphics gr)
   {
      if(image==null) return;
      Dimension sz=size();
      gr.drawImage(image,0,0,sz.width,sz.height,this);
   }

   public Dimension preferredSize()
   {
      return new Dimension(width, height);
   }

   public Dimension minimumSize()
   {
      return preferredSize();
   }
}
