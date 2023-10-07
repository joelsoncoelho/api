CREATE TABLE consultas (
    id bigint NOT NULL auto_increment,
    medico_id bigint NOT NULL,
    paciente_id bigint NOT NULL,
    data datetime NOT NULL,
    PRIMARY KEY(id)
 );

 ALTER TABLE consultas ADD CONSTRAINT fk_consultas_medico_id FOREIGN KEY (medico_id) REFERENCES medicos (id);
 ALTER TABLE consultas ADD CONSTRAINT fk_consultas_paciente_id FOREIGN KEY (paciente_id) REFERENCES pacientes (id);
