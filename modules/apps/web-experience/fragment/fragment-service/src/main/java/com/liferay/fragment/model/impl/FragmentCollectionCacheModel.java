/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.fragment.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.fragment.model.FragmentCollection;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FragmentCollection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FragmentCollection
 * @generated
 */
@ProviderType
public class FragmentCollectionCacheModel implements CacheModel<FragmentCollection>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FragmentCollectionCacheModel)) {
			return false;
		}

		FragmentCollectionCacheModel fragmentCollectionCacheModel = (FragmentCollectionCacheModel)obj;

		if (fragmentCollectionId == fragmentCollectionCacheModel.fragmentCollectionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fragmentCollectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{fragmentCollectionId=");
		sb.append(fragmentCollectionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FragmentCollection toEntityModel() {
		FragmentCollectionImpl fragmentCollectionImpl = new FragmentCollectionImpl();

		fragmentCollectionImpl.setFragmentCollectionId(fragmentCollectionId);
		fragmentCollectionImpl.setGroupId(groupId);
		fragmentCollectionImpl.setCompanyId(companyId);
		fragmentCollectionImpl.setUserId(userId);

		if (userName == null) {
			fragmentCollectionImpl.setUserName(StringPool.BLANK);
		}
		else {
			fragmentCollectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fragmentCollectionImpl.setCreateDate(null);
		}
		else {
			fragmentCollectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fragmentCollectionImpl.setModifiedDate(null);
		}
		else {
			fragmentCollectionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			fragmentCollectionImpl.setName(StringPool.BLANK);
		}
		else {
			fragmentCollectionImpl.setName(name);
		}

		if (description == null) {
			fragmentCollectionImpl.setDescription(StringPool.BLANK);
		}
		else {
			fragmentCollectionImpl.setDescription(description);
		}

		fragmentCollectionImpl.resetOriginalValues();

		return fragmentCollectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fragmentCollectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(fragmentCollectionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long fragmentCollectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String description;
}