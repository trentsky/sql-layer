/**
 * Copyright (C) 2011 Akiban Technologies Inc.
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses.
 */

package com.akiban.server.types;

public abstract class DoubleConverter extends AbstractConverter {

    // AbstractDoubleConverter interface
    
    public abstract double getDouble(ValueSource source);
    
    // defined in subclasses
    
    protected abstract void putDouble(ValueTarget target, double value);
    
    // for use in this package

    @Override
    protected final void doConvert(ValueSource source, ValueTarget target) {
        putDouble(target, getDouble(source));
    }

    DoubleConverter() {}
}
