/*
 * semanticcms-resources-unavailable - Unavailable sets of SemanticCMS resources.
 * Copyright (C) 2021, 2022, 2024, 2025  AO Industries, Inc.
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
 * along with semanticcms-resources-unavailable.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.resources.unavailable {
  exports com.semanticcms.resources.unavailable;
  // Direct
  requires com.aoapps.net.types; // <groupId>com.aoapps</groupId><artifactId>ao-net-types</artifactId>
  requires com.semanticcms.core.resources; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-resources</artifactId>
}
