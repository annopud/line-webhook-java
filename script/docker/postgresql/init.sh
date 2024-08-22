#!/bin/bash

echo "test init file!!!!!!!!"

psql -U $POSTGRES_USER -d $POSTGRES_DB -a -f /my_postgres/postgres_seed.sql

#set -e

#psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
#	CREATE USER docker;
#	CREATE DATABASE docker;
#	GRANT ALL PRIVILEGES ON DATABASE docker TO docker;
##EOSQL

