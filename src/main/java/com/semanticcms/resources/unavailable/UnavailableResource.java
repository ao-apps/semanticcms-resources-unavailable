/*
 * semanticcms-resources-unavailable - Unavailable sets of SemanticCMS resources.
 * Copyright (C) 2017, 2021, 2022  AO Industries, Inc.
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

package com.semanticcms.resources.unavailable;

import com.aoapps.net.Path;
import com.semanticcms.core.resources.Resource;
import com.semanticcms.core.resources.ResourceConnection;
import java.io.File;
import java.io.IOException;

/**
 * An unavailable {@link Resource}
 */
public class UnavailableResource extends Resource {

  public UnavailableResource(UnavailableResourceStore store, Path path) {
    super(store, path);
  }

  @Override
  public UnavailableResourceStore getStore() {
    return (UnavailableResourceStore)store;
  }

  @Override
  public boolean isFilePreferred() {
    return false;
  }

  @Override
  public File getFile() {
    return null;
  }

  @Override
  public ResourceConnection open() throws IOException {
    throw new IOException("Resource store is unavailable: " + path);
  }
}
