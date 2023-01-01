create user 'qauser'@'localhost' identified by 'qapassword';

grant insert on awsqa2.* to 'qauser'@'localhost';
grant select on awsqa2.* to 'qauser'@'localhost';
grant update on awsqa2.* to 'qauser'@'localhost';
grant delete on awsqa2.* to 'qauser'@'localhost';
