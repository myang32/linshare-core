/*
 * LinShare is an open source filesharing software, part of the LinPKI software
 * suite, developed by Linagora.
 * 
 * Copyright (C) 2015 LINAGORA
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version, provided you comply with the Additional Terms applicable for
 * LinShare software by Linagora pursuant to Section 7 of the GNU Affero General
 * Public License, subsections (b), (c), and (e), pursuant to which you must
 * notably (i) retain the display of the “LinShare™” trademark/logo at the top
 * of the interface window, the display of the “You are using the Open Source
 * and free version of LinShare™, powered by Linagora © 2009–2015. Contribute to
 * Linshare R&D by subscribing to an Enterprise offer!” infobox and in the
 * e-mails sent with the Program, (ii) retain all hypertext links between
 * LinShare and linshare.org, between linagora.com and Linagora, and (iii)
 * refrain from infringing Linagora intellectual property rights over its
 * trademarks and commercial brands. Other Additional Terms apply, see
 * <http://www.linagora.com/licenses/> for more details.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License and
 * its applicable Additional Terms for LinShare along with this program. If not,
 * see <http://www.gnu.org/licenses/> for the GNU Affero General Public License
 * version 3 and <http://www.linagora.com/licenses/> for the Additional Terms
 * applicable to LinShare software.
 */
package org.linagora.linshare.core.domain.entities;

import org.linagora.linshare.core.domain.constants.ContainerQuotaType;

public class ContainerQuota extends Quota {

	protected Long maxFileSize;

	protected ContainerQuotaType containerQuotaType;

	protected DomainQuota domainQuota;

	public ContainerQuota() {
		super();
	}

	public ContainerQuota(AbstractDomain domain, AbstractDomain parentDomain, DomainQuota domainQuota,
			ContainerQuota parentContainerQuota) {
		// related domains.
		this.domain = domain;
		this.parentDomain = parentDomain;
		// Link to the parent
		this.domainQuota = domainQuota;
		// quota configuration
		this.currentValue = 0L;
		this.lastValue = 0L;
		this.quota = parentContainerQuota.getQuota();
		this.quotaWarning = parentContainerQuota.getQuotaWarning();
		this.maxFileSize = parentContainerQuota.getMaxFileSize();
		// Kind of container.
		this.containerQuotaType = parentContainerQuota.getContainerQuotaType();
		this.override = false;
		this.maintenance = false;
	}

	/**
	 * For tests only.
	 * @param domain
	 * @param parentDomain
	 * @param domainQuota
	 * @param quota
	 * @param quotaWarning
	 * @param fileSizeMax
	 * @param currentValue
	 * @param lastValue
	 * @param containerType
	 */
	public ContainerQuota(AbstractDomain domain, AbstractDomain parentDomain, DomainQuota domainQuota, long quota,
			long quotaWarning, long fileSizeMax, long currentValue, long lastValue, ContainerQuotaType containerType) {
		super(null, domain, parentDomain, quota, quotaWarning, currentValue, lastValue);
		this.maxFileSize = fileSizeMax;
		this.containerQuotaType = containerType;
		this.domainQuota = domainQuota;
		this.override = false;
		this.maintenance = false;
	}

	public Long getMaxFileSize() {
		return maxFileSize;
	}

	public void setMaxFileSize(Long maxFileSize) {
		this.maxFileSize = maxFileSize;
	}

	public ContainerQuotaType getContainerQuotaType() {
		return containerQuotaType;
	}

	public void setContainerQuotaType(ContainerQuotaType containerQuotaType) {
		this.containerQuotaType = containerQuotaType;
	}

	public DomainQuota getDomainQuota() {
		return domainQuota;
	}

	public void setDomainQuota(DomainQuota domainQuota) {
		this.domainQuota = domainQuota;
	}

	public void setBusinessMaxFileSize(Long maxFileSize) {
		if (maxFileSize != null) {
			this.maxFileSize = maxFileSize;
		}
	}

	@Override
	public String toString() {
		return "ContainerQuota [containerType=" + containerQuotaType + ", uuid=" + uuid + ", account=" + account
				+ ", quota=" + quota + ", quotaWarning=" + quotaWarning + ", currentValue=" + currentValue
				+ ", lastValue=" + lastValue + ", fileSizeMax=" + maxFileSize + "]";
	}

}
