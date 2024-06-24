drop schema public;
create schema public;
create table activosfijos(
    idactivodijo serial not null primary key,
    activofijo varchar,
    costoinicial varchar,
    vidautil integer,
    fechacompra date
)