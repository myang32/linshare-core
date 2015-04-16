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
package org.linagora.linshare.core.service;

import java.util.List;

import javax.mail.SendFailedException;

import org.linagora.linshare.core.domain.entities.MailContainer;
import org.linagora.linshare.core.domain.entities.MailContainerWithRecipient;
import org.linagora.linshare.core.exception.BusinessException;

/** Provides notification services.
 *
 */
public interface NotifierService {
	
    /**
     * 
     * Send notification to a recipient.
	 * @param smtpSender the smtp sender mail, for the "From" field of the mail.
	 * @param replyTo user who send the mail. can be null. if null put generic Linshare account.
	 * @param recipient
	 * @param subject
	 * @param htmlContent html mail content
	 * @param textContent alternative mail with text content
     * @param inReplyTo : message ID
     * @param references : message ID list
     * @throws SendFailedException
     */
    public void sendNotification(String smtpSender, String replyTo, String recipient, String subject,String htmlContent, String textContent, String inReplyTo, String references) throws SendFailedException;
    
    /**
	 * @param smtpSender the smtp sender mail, for the "From" field of the mail.
     * @param replyTo user who send the mail. can be null. if null put generic Linshare account.
     * @param recipient the recipient mail
     * @param mailContainer the mail container
     * @throws SendFailedException 
     */
    public void sendNotification(String smtpSender, String replyTo, String recipient, MailContainer mailContainer) throws SendFailedException;

    
    /**
     * @param mailContainerWithRecipient list of mail containers attached to recipients
     * @throws BusinessException 
     */
    public void sendNotification(List<MailContainerWithRecipient> mailContainerWithRecipient) throws BusinessException;
    
    public void sendNotification(MailContainerWithRecipient mailContainerWithRecipient) throws BusinessException;
  
}
