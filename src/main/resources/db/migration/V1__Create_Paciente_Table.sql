CREATE SEQUENCE paciente_seq START WITH 1 INCREMENT BY 1;

CREATE TABLE paciente (
    codigo INTEGER PRIMARY KEY,
    nome VARCHAR2(100),
    cpf VARCHAR2(11),
    data_nascimento DATE
);
