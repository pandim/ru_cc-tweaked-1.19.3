/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2022. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */
package dan200.computercraft.shared.util;

import java.time.LocalDateTime;
import java.time.Month;

public enum Holiday {
    NONE,

    /**
     * 14th February.
     */
    VALENTINES,

    /**
     * 24th-26th December.
     *
     * @see net.minecraft.client.renderer.blockentity.ChestRenderer
     */
    CHRISTMAS;

    public static Holiday getCurrent() {
        var calendar = LocalDateTime.now();
        var month = calendar.getMonth();
        var day = calendar.getDayOfMonth();
        if (month == Month.FEBRUARY && day == 14) return VALENTINES;
        if (month == Month.DECEMBER && day >= 24 && day <= 26) return CHRISTMAS;
        return NONE;
    }
}
