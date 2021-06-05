/*
 * semanticcms-resources-unavailable - Unavailable sets of SemanticCMS resources.
 * Copyright (C) 2017, 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-resources-unavailable.
 *
 * semanticcms-resources-unavailable is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-resources-unavailable is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-resources-unavailable.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.semanticcms.resources.unavailable;

import com.aoapps.net.Path;
import com.semanticcms.core.resources.ResourceStore;

/**
 * An unavailable {@link ResourceStore}
 */
public class UnavailableResourceStore implements ResourceStore {

	private static final UnavailableResourceStore instance = new UnavailableResourceStore();

	public static UnavailableResourceStore getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "unavailable:";
	}

	@Override
	public boolean isAvailable() {
		return false;
	}

	@Override
	public UnavailableResource getResource(Path path) {
		return new UnavailableResource(this, path);
	}
}
