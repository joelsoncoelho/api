
CREATE TABLE users_roles (
    user_id bigint NOT NULL,
    role_id bigint NOT NULL,
    PRIMARY KEY (user_id, role_id)
) engine=InnoDB;

ALTER TABLE users_roles add CONSTRAINT FK_role_id FOREIGN KEY (role_id) REFERENCES roles (id);

ALTER TABLE users_roles add CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES users (id);