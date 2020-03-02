CREATE SCHEMA voicemail;

DROP SEQUENCE IF EXISTS voicemail.user_id_seq;
CREATE SEQUENCE voicemail.user_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

DROP SEQUENCE IF EXISTS  voicemail.mail_id_seq;
CREATE SEQUENCE  voicemail.mail_id_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

DROP SEQUENCE IF EXISTS voicemail.user_mail_id_seq;
CREATE SEQUENCE voicemail.user_mail_id_seq
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;

DROP TABLE IF EXISTS voicemail.user;
CREATE TABLE voicemail.user (
 	user_id bigint DEFAULT nextval('voicemail.user_id_seq'::regclass) NOT NULL,
 	user_name character varying(64),
 	user_password character varying(64),
 	user_phone_number character varying(20),
 	user_email character varying(64),
 CONSTRAINT user_pkey PRIMARY KEY (user_id)
);

DROP TABLE IF EXISTS voicemail.mail;
CREATE TABLE voicemail.mail (
   mail_id bigint DEFAULT nextval('voicemail.mail_id_seq'::regclass) NOT NULL,
   mail_from character varying(64),
   mail_to character varying(64),
   mail_subject_name character varying(64),
   mail_status character varying(64) DEFAULT 'unavailable',
   mail_created_date time without time zone,
   mail_modified_date time without time zone,
     CONSTRAINT mail_pkey PRIMARY KEY (mail_id)
);

DROP TABLE IF EXISTS voicemail.user_mail_map;
CREATE TABLE voicemail.user_mail_map (
    user_mail_map_id bigint DEFAULT nextval('voicemail.user_mail_id_seq'::regclass) NOT NULL ,
    user_id bigint,
    mail_id bigint,
    CONSTRAINT user_mail_map_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES voicemail.user(user_id) MATCH SIMPLE
            ON UPDATE NO ACTION ON DELETE NO ACTION,
    CONSTRAINT user_mail_map_mail_id_fkey FOREIGN KEY (mail_id)
        REFERENCES voicemail.mail(mail_id) MATCH SIMPLE
            ON UPDATE NO ACTION ON DELETE NO ACTION,
    CONSTRAINT user_order_map_pkey PRIMARY KEY (user_mail_map_id)
);

select setval('voicemail.user_id_seq', (select max(user_id)+1 from voicemail.user), false);
select setval('voicemail.mail_id_seq', (select max(mail_id)+1 from voicemail.mail), false);
select setval('voicemail.user_mail_id_seq', (select max(user_mail_map_id)+1 from voicemail.user_mail_map), false);