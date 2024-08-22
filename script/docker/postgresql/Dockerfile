FROM postgres:latest
WORKDIR /my_postgres
EXPOSE 5432
COPY ./init.sh /docker-entrypoint-initdb.d
COPY ./postgres_seed.sql /my_postgres/postgres_seed.sql
#CMD ["rm", "-r", "/var/lib/postgresql/data/*"]
#CMD ["psql", "-h", "localhost", "-U", "postgres", "&&", "\l", "postgres_seed.sql"]