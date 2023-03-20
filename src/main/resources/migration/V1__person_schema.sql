CREATE TABLE company (
    id bigint PRIMARY KEY NOT NULL,
    name varchar(100),
    created_at timestamp WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp WITH TIME ZONE
);

CREATE TABLE person (
    id bigint PRIMARY KEY NOT NULL,
    company_id bigint NOT NULL,
    name varchar(100),
    age int,
    address varchar(100),
    created_at timestamp WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp WITH TIME ZONE,
    CONSTRAINT fk_person_company FOREIGN KEY (company_id) REFERENCES public.company(id)
);