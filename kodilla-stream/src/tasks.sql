CREATE TABLE ISSUESLISTS (
                             ID SERIAL PRIMARY KEY,
                             NAME VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE ISSUES (
                        ID SERIAL PRIMARY KEY,
                        ISSUESLIST_ID BIGINT UNSIGNED NOT NULL,
                        SUMMARY VARCHAR(255) NOT NULL,
                        DESCRIPTION TEXT,
                        USER_ID_ASSIGNEDTO BIGINT UNSIGNED,
                        FOREIGN KEY (ISSUESLIST_ID) REFERENCES ISSUESLISTS(ID),
                        FOREIGN KEY (USER_ID_ASSIGNEDTO) REFERENCES USERS(ID)
);

INSERT INTO ISSUESLISTS (NAME) VALUES
                                   ('ToDo'),
                                   ('In progress'),
                                   ('Done');


INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) VALUES
                                                                                 (1, 'Implement login system', 'Create user authentication', 1),
                                                                                 (1, 'Database schema design', 'Design tables for the project', 2),
                                                                                 (1, 'API setup', 'Create basic API endpoints', 3),
                                                                                 (1, 'Front-end setup', 'Implement initial UI components', 1),
                                                                                 (1, 'Write unit tests', 'Ensure code quality', 2);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) VALUES
                                                                                 (2, 'Fix login bug', 'Resolve authentication issue', 3),
                                                                                 (2, 'Optimize database queries', 'Improve query performance', 1),
                                                                                 (2, 'Refactor API endpoints', 'Improve API structure', 2),
                                                                                 (2, 'Enhance UI responsiveness', 'Make UI mobile-friendly', 3),
                                                                                 (2, 'Update documentation', 'Improve project docs', 1);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) VALUES
                                                                                 (3, 'Deploy to production', 'Move project to live server', 2),
                                                                                 (3, 'Run final tests', 'Ensure everything works', 3),
                                                                                 (3, 'Prepare release notes', 'Document all changes', 1),
                                                                                 (3, 'Conduct team review', 'Final team check', 2),
                                                                                 (3, 'Announce release', 'Public announcement', 3);
