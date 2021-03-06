/*
 * Copyright 2005-2015 by BerryWorks Software, LLC. All rights reserved.
 *
 * This file is part of EDIReader. You may obtain a license for its use directly from
 * BerryWorks Software, and you may also choose to use this software under the terms of the
 * GPL version 3. Other products in the EDIReader software suite are available only by licensing
 * with BerryWorks. Only those files bearing the GPL statement below are available under the GPL.
 *
 * EDIReader is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * EDIReader is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with EDIReader.  If not,
 * see <http://www.gnu.org/licenses/>.
 */

/*
*  Generated by plugin generator utility by BerryWorks Software, LLC.
*/
package com.berryworks.edireader.plugin;

import com.berryworks.edireader.Plugin;

public class ANSI_810 extends Plugin {
    public ANSI_810() {
        super("810", "Invoice");
        loops = new LoopDescriptor[]{
                new LoopDescriptor(".", "AMT", 0, "*"),
                new LoopDescriptor(".", "BAL", 0, "*"),
                new LoopDescriptor(".", "BIG", 0, "*"),
                new LoopDescriptor(null, "CAD", 1, "/IT1"),
                new LoopDescriptor(".", "CAD", 0, "*"),
                new LoopDescriptor(null, "CRC", 1, "/IT1"),
                new LoopDescriptor(".", "CRC", 0, "*"),
                new LoopDescriptor(null, "CTP", 1, "/IT1"),
                new LoopDescriptor(".", "CTT", 0, "*"),
                new LoopDescriptor(null, "CUR", 1, "/IT1"),
                new LoopDescriptor(".", "CUR", 0, "*"),
                new LoopDescriptor(null, "DMG", 2, "/IT1/N1"),
                new LoopDescriptor(null, "DMG", 1, "/N1"),
                new LoopDescriptor(null, "DTM", 3, "/IT1/SAC/TXI"),
                new LoopDescriptor(null, "DTM", 2, "/IT1/SLN"),
                new LoopDescriptor(null, "DTM", 1, "/V1"),
                new LoopDescriptor(".", "DTM", 0, "*"),
                new LoopDescriptor("FA1", "FA1", 2, "/IT1"),
                new LoopDescriptor("FA1", "FA1", 1, "*"),
                new LoopDescriptor(null, "FA2", 2, "/IT1/FA1"),
                new LoopDescriptor(null, "FA2", 1, "/FA1"),
                new LoopDescriptor(".", "FOB", 0, "*"),
                new LoopDescriptor(".", "INC", 0, "*"),
                new LoopDescriptor("ISS", "ISS", 1, "*"),
                new LoopDescriptor("IT1", "IT1", 1, "*"),
                new LoopDescriptor(null, "IT3", 1, "/IT1"),
                new LoopDescriptor(null, "ITD", 1, "/IT1"),
                new LoopDescriptor(".", "ITD", 0, "*"),
                new LoopDescriptor(null, "L7", 1, "/IT1"),
                new LoopDescriptor(".", "L7", 0, "*"),
                new LoopDescriptor("LM", "LM", 2, "/IT1"),
                new LoopDescriptor("LM", "LM", 1, "*"),
                new LoopDescriptor(null, "LQ", 2, "/IT1/LM"),
                new LoopDescriptor(null, "LQ", 1, "/LM"),
                new LoopDescriptor(null, "MEA", 2, "/IT1/PID"),
                new LoopDescriptor(null, "MEA", 1, "/IT1"),
                new LoopDescriptor(".", "MEA", 0, "*"),
                new LoopDescriptor(null, "MSG", 1, "/N9"),
                new LoopDescriptor("N1", "N1", 2, "/IT1"),
                new LoopDescriptor("N1", "N1", 1, "*"),
                new LoopDescriptor(null, "N2", 2, "/IT1/N1"),
                new LoopDescriptor(null, "N2", 1, "/N1"),
                new LoopDescriptor(null, "N3", 2, "/IT1/N1"),
                new LoopDescriptor(null, "N3", 1, "/N1"),
                new LoopDescriptor(null, "N4", 2, "/IT1/N1"),
                new LoopDescriptor(null, "N4", 1, "/N1"),
                new LoopDescriptor("N9", "N9", 1, "*"),
                new LoopDescriptor(".", "NTE", 0, "*"),
                new LoopDescriptor(null, "PAM", 1, "/IT1"),
                new LoopDescriptor(".", "PAM", 0, "*"),
                new LoopDescriptor(null, "PER", 2, "/IT1/N1"),
                new LoopDescriptor(null, "PER", 1, "/N1"),
                new LoopDescriptor(".", "PER", 0, "*"),
                new LoopDescriptor("PID", "PID", 2, "/IT1"),
                new LoopDescriptor(null, "PID", 1, "/ISS"),
                new LoopDescriptor(".", "PID", 0, "*"),
                new LoopDescriptor(null, "PKG", 1, "/IT1"),
                new LoopDescriptor(".", "PKG", 0, "*"),
                new LoopDescriptor(null, "PO4", 1, "/IT1"),
                new LoopDescriptor(null, "PWK", 1, "/IT1"),
                new LoopDescriptor(".", "PWK", 0, "*"),
                new LoopDescriptor(null, "QTY", 1, "/IT1"),
                new LoopDescriptor(null, "R4", 2, "/IT1/V1"),
                new LoopDescriptor(null, "R4", 1, "/V1"),
                new LoopDescriptor(null, "REF", 2, "/IT1/SLN"),
                new LoopDescriptor(null, "REF", 1, "/N1"),
                new LoopDescriptor(".", "REF", 1, "/IT1"), // added
                new LoopDescriptor(".", "REF", 0, "*"),
                new LoopDescriptor("SAC", "SAC", 2, "/IT1"),
                new LoopDescriptor("SAC", "SAC", 1, "*"),
                new LoopDescriptor(null, "SDQ", 1, "/IT1"),
                new LoopDescriptor(".", "SE", 0, "*"),
                new LoopDescriptor("SLN", "SLN", 2, "/IT1"),
                new LoopDescriptor(null, "SR", 1, "/IT1"),
                new LoopDescriptor(".", "ST", 0, "*"),
                new LoopDescriptor(null, "TC2", 2, "/IT1/SLN"),
                new LoopDescriptor(".", "TDS", 0, "*"),
                new LoopDescriptor("TXI", "TXI", 3, "/IT1/SAC"),
                new LoopDescriptor(null, "TXI", 2, "/IT1/SLN"),
                new LoopDescriptor(null, "TXI", 1, "/IT1"),
                new LoopDescriptor(".", "TXI", 0, "*"),
                new LoopDescriptor("V1", "V1", 2, "/IT1"),
                new LoopDescriptor("V1", "V1", 1, "*"),
                new LoopDescriptor(null, "YNQ", 1, "/IT1"),
                new LoopDescriptor(".", "YNQ", 0, "*"),
        };
    }
}
