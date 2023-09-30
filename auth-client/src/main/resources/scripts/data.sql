INSERT INTO  clients (id,client_id,secret,authorization) VALUES(1,'client','secret','client_secret_basic');


INSERT INTO  grant_type (id,client_id,grant_type) VALUES(2,1,'AUTHORIZATION_CODE');
INSERT INTO  grant_type (id,client_id,grant_type) VALUES(1,1,'CLIENT_CREDENTIALS');

INSERT INTO  redirect_urls (id,client_id,url) VALUES(1,1,'http://example.com/auth');

INSERT INTO  scope (id,client_id,scope) VALUES(1,1,'OPENID');