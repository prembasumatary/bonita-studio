/**
 * Copyright (C) 2014 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2.0 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package org.bonitasoft.studio.properties.sections.general;

import org.bonitasoft.studio.expression.editor.provider.IExpressionValidator;
import org.bonitasoft.studio.model.expression.Expression;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;


/**
 * @author Florine Boudin
 *
 */
public class ExpressionNotEmptyValidator implements IExpressionValidator {

	private Expression inputExpression;
	
	public ExpressionNotEmptyValidator(){
		
	}
	
	@Override
	public IStatus validate(Object value) {
			if (((String)value).length()<1){
				return ValidationStatus.error("This expression can't be empty");
			}
	return Status.OK_STATUS;
	
	}

	@Override
	public void setInputExpression(Expression inputExpression) {
		this.inputExpression = inputExpression;

	}

	@Override
	public void setDomain(EditingDomain domain) {
		

	}

	@Override
	public void setContext(EObject context) {
		

	}

}