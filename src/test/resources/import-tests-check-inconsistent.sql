INSERT INTO account(id, mail, account_type, ls_uuid, creation_date, modification_date, role_id, locale, external_mail_locale, cmis_locale, enable, password, destroyed, domain_id, purge_step) VALUES (20, 'user5@linshare.org', 2, 'aebe1b64-39c0-11e5-9fa8-080027b8274y', now(), now(), 0, 'en', 'en', 'en', true, null, 0, 3, 'IN_USE');
INSERT INTO users(account_id, first_name, last_name, ldap_uid, can_upload, comment, restricted, CAN_CREATE_GUEST, inconsistent) VALUES (20, 'Peter', 'parker', 'user5', true, '', false, true, true);
INSERT INTO account(id, mail, account_type, ls_uuid, creation_date, modification_date, role_id, locale, external_mail_locale, cmis_locale, enable, password, destroyed, domain_id, purge_step) VALUES (21, 'user6@linshare.org', 2, 'd896140a-39c0-11e5-b7f9-080027b8274u', now(), now(), 0, 'en', 'en', 'en', true, null, 0, 3, 'IN_USE');
INSERT INTO users(account_id, first_name, last_name, ldap_uid, can_upload, comment, restricted, CAN_CREATE_GUEST, inconsistent) VALUES (21, 'Bruce', 'Wane', 'user6', true, '', false, true, true);
INSERT INTO account(id, mail, account_type, ls_uuid, creation_date, modification_date, role_id, locale, external_mail_locale, cmis_locale, enable, password, destroyed, domain_id, purge_step) VALUES (22, 'user7@linshare.org', 2, 'e524e1ba-39c0-11e5-b704-080027b8274i', now(), now(), 0, 'en', 'en', 'en', true, null, 0, 3, 'IN_USE');
INSERT INTO users(account_id, first_name, last_name, ldap_uid, can_upload, comment, restricted, CAN_CREATE_GUEST, inconsistent) VALUES (22, 'Oliver', 'Twist', 'user7', true, '', false, true, true);
INSERT INTO account(id, mail, account_type, ls_uuid, creation_date, modification_date, role_id, locale, external_mail_locale, cmis_locale, enable, password, destroyed, domain_id, purge_step) VALUES (23, 'clark@kent.org', 2, 'e524e1ba-39c0-11e5-b704-080027b8274o', now(), now(), 0, 'en', 'en', 'en', true, null, 0, 3, 'IN_USE');
INSERT INTO users(account_id, first_name, last_name, can_upload, comment, restricted, CAN_CREATE_GUEST, inconsistent) VALUES (23, 'Clark', 'Kent', true, '', false, true, true);