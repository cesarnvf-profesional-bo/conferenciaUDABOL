PGPASSWORD=123qwe dropdb -h localhost -p 5432 -U postgres iaaigafbd
PGPASSWORD=123qwe createdb -h localhost -p 5432 -U postgres iaaigafbd
PGPASSWORD=123qwe psql -h localhost -p 5432 -U postgres -d iaaigafbd -f iaaigafTablas001.sql
PGPASSWORD=123qwe psql -h localhost -p 5432 -U postgres -d iaaigafbd -f iaaigafDatos001.sql
