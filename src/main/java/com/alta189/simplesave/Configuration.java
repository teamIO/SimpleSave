/*
 * This file is part of SimpleSave
 *
 * SimpleSave is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SimpleSave is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.alta189.simplesave;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
	protected final Map<String, String> properties;
	protected final Driver driver;

	public Configuration(Map<String, String> properties, Driver driver) {
		this.properties = properties;
		this.driver = driver;
	}

	public Configuration(Driver driver) {
		this(new HashMap<String, String>(), driver);
	}

	public Driver getDriver() {
		return driver;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public String getProperty(String property) {
		return properties.get(property);
	}

	public Configuration setProperty(String property, String value) {
		properties.put(property, value);
		return this;
	}

	public Configuration removeProperty(String property) {
		properties.remove(property);
		return this;
	}

	public boolean containsProperty(String property) {
		return properties.containsKey(property);
	}
}
