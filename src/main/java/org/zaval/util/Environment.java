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

package org.zaval.util;

import java.util.*;

public class Environment extends Hashtable {
	public int getAsInt(String name) {
		String s = (String) get(name);
		if (s == null)
			return Integer.MAX_VALUE;
		return Integer.parseInt(s);
	}

	public long getAsLong(String name) {
		String s = (String) get(name);
		if (s == null)
			return Long.MAX_VALUE;
		return Long.parseLong(s);
	}

	public String getAsString(String name) {
		return (String) get(name);
	}

	public void setAsInt(String name, int value) {
		put(name, "" + value);
	}

	public void setAsLong(String name, long value) {
		put(name, "" + value);
	}
}
