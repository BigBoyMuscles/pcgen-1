/*
 * Copyright 2008 (C) Thomas Parker <thpr@users.sourceforge.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package plugin.lsttokens.ability;

import pcgen.cdom.enumeration.StringKey;
import pcgen.core.Ability;
import pcgen.rules.persistence.token.AbstractStringToken;
import pcgen.rules.persistence.token.CDOMPrimaryToken;

/**
 * Class deals with APPLIEDNAME Token
 */
public class AppliedNameToken extends AbstractStringToken<Ability>
		implements CDOMPrimaryToken<Ability>
{

	@Override
	public String getTokenName()
	{
		return "APPLIEDNAME";
	}

	@Override
	public Class<Ability> getTokenClass()
	{
		return Ability.class;
	}

	@Override
	protected StringKey stringKey()
	{
		return StringKey.APPLIED_NAME;
	}
}
