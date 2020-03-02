#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
	CREATE DATABASE voicemail;
    GRANT ALL PRIVILEGES ON DATABASE voicemail TO voicemail_usr;
EOSQL

# populating dynamo
psql -U voicemail_usr voicemail < /tmp/psql/voicemail/voicemail_schema.sql
