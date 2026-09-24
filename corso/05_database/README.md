# 05 — Database

## Obiettivi

Collegare un'applicazione Java a un database relazionale con transazioni, query parametrizzate e separazione del livello di persistenza.

## Sequenza

1. Fondamenti SQL e modello relazionale
2. [JDBC: connessioni](../../appunti/050_Java_Database.md)
3. [Statement e query](../../appunti/051_Java_Database.md)
4. [ResultSet](../../appunti/052_Java_Database.md)
5. [DAO](../../appunti/036_dao_pattern.md)
6. [Connection pooling](../../appunti/048_JDBC_ConnectionPooling.md)
7. JPA/Hibernate nel modulo web

## Pratica

Usare sempre `PreparedStatement`, chiudere le risorse con try-with-resources e verificare correttamente transazioni ed errori.
