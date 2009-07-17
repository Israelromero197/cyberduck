package ch.cyberduck.ui.cocoa;

/*
 *  Copyright (c) 2007 David Kocher. All rights reserved.
 *  http://cyberduck.ch/
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  Bug fixes, suggestions and comments should be sent to:
 *  dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.core.PathFilter;
import ch.cyberduck.core.Status;
import ch.cyberduck.core.Transfer;
import ch.cyberduck.ui.cocoa.foundation.NSAttributedString;
import ch.cyberduck.ui.cocoa.foundation.NSObject;

/**
 * @version $Id$
 */
public class CDDownloadPromptModel extends CDTransferPromptModel {

    public CDDownloadPromptModel(CDWindowController c, Transfer transfer) {
        super(c, transfer);
    }

    /**
     * Filtering what files are displayed. Used to
     * decide which files to include in the prompt dialog
     */
    private PathFilter<Path> filter;

    protected PathFilter<Path> filter() {
        if(null == filter) {
            filter = new PromptFilter() {
                @Override
                public boolean accept(Path child) {
                    log.debug("accept:" + child);
                    if(transfer.exists(child.getLocal())) {
                        if(child.attributes.isFile()) {
                            if(child.getLocal().attributes.getSize() == 0) {
                                // Do not prompt for zero sized files
                                return false;
                            }
                        }
                        return super.accept(child);
                    }
                    return false;
                }
            };
        }
        return filter;
    }

    @Override
    protected NSObject objectValueForItem(final Path item, final String identifier) {
        if(identifier.equals(CDTransferPromptModel.SIZE_COLUMN)) {
            return NSAttributedString.attributedStringWithAttributes(Status.getSizeAsString(item.getLocal().attributes.getSize()),
                    CDTableCellAttributes.browserFontRightAlignment());
        }
        if(identifier.equals(CDTransferPromptModel.WARNING_COLUMN)) {
            if(item.attributes.isFile()) {
                if(item.attributes.getSize() == 0) {
                    return ALERT_ICON;
                }
                if(item.getLocal().attributes.getSize() > item.attributes.getSize()) {
                    return ALERT_ICON;
                }
            }
            return NO_ICON;
        }
        return super.objectValueForItem(item, identifier);
    }
}