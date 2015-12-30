/**
 * Copyright (C) 2015 Bonitasoft S.A.
 * Bonitasoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.bonitasoft.studio.expression.core.scope;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

/**
 * Provide a variable scope for an Expression given its location in the model
 */
@Creatable
@Singleton
public class ExpressionScopeProvider {

    public ExpressionScope get(ModelLocation location) {
        return resolveScope(location);
    }

    private ExpressionScope resolveScope(ModelLocation location) {
        return new ExpressionScopeResolver().resolve(location);
    }

}
