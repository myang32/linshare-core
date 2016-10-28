-- topdomain 2, ACCOUNT_QUOTA - Jane (11)
INSERT INTO quota (
	id, uuid, creation_date, modification_date, batch_modification_date,
	domain_quota, ensemble_quota, current_value, last_value,
	domain_id, account_id, parent_domain_id, quota,
	quota_warning, file_size_max, ensemble_type, quota_type)
VALUES (
	101, 'aebe1b64-39c0-11e5-9fa8-080027b8274a', NOW(), NOW(), NOW(),
	null, 5, 0, 0,
	2, 11, null, 1099511627776,
	1045824536576, 10737418240, null, 'ACCOUNT_QUOTA');

-- topdomain 2, ACCOUNT_QUOTA - John (12)
INSERT INTO quota (
	id, uuid, creation_date, modification_date, batch_modification_date,
	domain_quota, ensemble_quota, current_value, last_value,
	domain_id, account_id, parent_domain_id, quota,
	quota_warning, file_size_max, ensemble_type, quota_type)
VALUES (
	102, 'aebe1b64-39c0-11e5-9fa8-080027b8274b', NOW(), NOW(), NOW(),
	null, 5, 0, 0,
	2, 12, null, 1099511627776,
	1045824536576, 10737418240, null, 'ACCOUNT_QUOTA');