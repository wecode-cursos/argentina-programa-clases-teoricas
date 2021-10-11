CREATE TABLE "estudiantes_cursos" (
	"id_curso"	INTEGER NOT NULL,
	"id_estudiante"	INTEGER NOT NULL,
	"fecha"	TEXT NOT NULL DEFAULT (datetime('now', 'localtime')),
	PRIMARY KEY("id_curso","id_estudiante")
);
