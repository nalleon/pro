package utilities;

import es.ies.puerto.exception.MyException;
import es.ies.puerto.model.db.jdbc.impl.OperationsDb;

public class Utilities {

    OperationsDb operationsDb = new OperationsDb();
    public final String MESSAGE_ERROR = "EXPECTED RESULT NOT FOUND";
    public final String scriptBBDD = "CREATE TABLE IF NOT EXISTS Personajes (\n" +
            "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "    nombre TEXT NOT NULL,\n" +
            "    genero TEXT\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE IF NOT EXISTS Alias (\n" +
            "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "    personaje_id INTEGER NOT NULL,\n" +
            "    alias TEXT NOT NULL,\n" +
            "    FOREIGN KEY(personaje_id) REFERENCES Personajes(id)\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE IF NOT EXISTS Poderes (\n" +
            "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "    poder TEXT NOT NULL\n" +
            ");\n" +
            "\n" +
            "CREATE TABLE IF NOT EXISTS Personajes_Poderes (\n" +
            "    personaje_id INTEGER,\n" +
            "    poder_id INTEGER,\n" +
            "    PRIMARY KEY (personaje_id, poder_id),\n" +
            "    FOREIGN KEY(personaje_id) REFERENCES Personajes(id),\n" +
            "    FOREIGN KEY(poder_id) REFERENCES Poderes(id)\n" +
            ");\n" +
            "\n" +
            "-- Inserción de datos\n" +
            "INSERT INTO Personajes (nombre, genero) VALUES \n" +
            "    ('Iron Man', 'Masculino'),\n" +
            "    ('Spider-Man', 'Masculino');\n" +
            "\n" +
            "INSERT INTO Alias (personaje_id, alias) VALUES \n" +
            "    (1, 'Tony Stark'),\n" +
            "    (2, 'Peter Parker');\n" +
            "\n" +
            "INSERT INTO Poderes (poder) VALUES \n" +
            "    ('Vuelo'),\n" +
            "    ('Armadura tecnológica avanzada'),\n" +
            "    ('Rayos láser'),\n" +
            "    ('Agilidad sobrehumana'),\n" +
            "    ('Trepamuros'),\n" +
            "    ('Sentido arácnido');\n" +
            "\n" +
            "INSERT INTO Personajes_Poderes (personaje_id, poder_id) VALUES \n" +
            "    (1, 1)," +
            "    (1, 2)," +
            "    (1, 3)," +
            "    (2, 4)," +
            "    (2, 5)," +
            "    (2, 6);";


    public final String  dropTablesQry="DROP TABLE IF EXISTS Poderes;" +
            "DROP TABLE IF EXISTS Personajes;" +
            "DROP TABLE IF EXISTS Alias;" +
            "DROP TABLE IF EXISTS Personajes_Poderes;";

    public Utilities() throws MyException {
        operationsDb = new OperationsDb();
    }

    public void dropTablesCreate() throws MyException {
        operationsDb.update(dropTablesQry);
        operationsDb.update(scriptBBDD);
    }
}
