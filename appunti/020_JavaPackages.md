# Package in Java




## Organizzazione delle classi
* La libreria standard segue il metodo di
organizzazione delle classi previsto da Java: le classi
tra loro “affini” sono raggruppate in package
* Ogni package ha un nome tipicamente composto da
due o più parole separate da . e contiene una o più
classi (ed eventualmente altri componenti)
* I nomi a più livelli riflettono un’organizzazione
gerarchica dei package simile a quella delle cartelle
(directory) su un disco

## Esempi di package
* java.lang Package fondamentale con
classi di uso molto comune
* java.io Package per l’Input/Output
* java.util Package con classi varie di
utilità generale
* java.text Package con classi per la
gestione ed elaborazione di
testi e dati in formato testuale

## Uso di classi appartenenti ad un package
* Solo le classi appartenenti al package java.lang sono
automaticamente disponibili in ogni programma
* Per l’uso di altri package in una classe è necessario
“importarli” tramite la parola riservata import
* Tutte le dichiarazioni di importazione devono trovarsi
prima della definizione della classe
* Si possono importare singole classi di un package p.e.
import java.util.Random
ma è più tipico importare comunque tutto il package:
import java.util.*

## I package
* All’atto pratico un package è un insieme di file .class
tipicamente archiviati in un file compresso .zip o .jar
* Ogni classe appartiene ad un package: la
dichiarazione di appartenenza può essere effettuata
all’inizio del codice della classe usando la parola
riservata package seguita dal nome del package
* Se non si dichiara esplicitamente il package la classe
viene assegnata ad un package “anonimo” che
contiene, oltre ad essa, tutte le classi senza package
presenti nella stessa directory



## Un package è un insieme logico di classi

* Fisicamente le classi stanno su uno o più file, tutti contenuti in una stessa directory
* Ogni package definisce un suo scope (ambiente di visibilità dei nomi)
* Stessi nomi in package diversi senza conflitti

## Nomi

### Un package è identificato univocamente
da un nome costruito gerarchicamente (notazione puntata)
* java.util
* it.bogliaccino.utilita

### Convenzione per generare nomi unici
* Usare come prefisso del nome del package il proprio nome internet invertito

## Creazione di un package

Tutti i file del package devono contenere la riga 

`package <nomePackage>;`

quale prima riga del file (tranne i commenti)

Specifica che la classe pubblica contenuta in quel file fa parte di quel package

## Utilizzo di un package

### Un package può essere utilizzato
* Mediante importazione del package
* Mediante riferimento esplicito

### Importare un package significa
* Importare la singola classe del package
`import nomePackage.nomeClass;`
* Importare tutte le classi del package
`import nomePackage;`
* Esempi 
  * import java.util.ArrayList;
  * import java.util.*;
  * import java.util;

### Riferimento esplicito (senza import)
* Specificare il nome per intero `java.util.ArrayList `  
* Invece di import `java.util.*;`

### Collisioni
* Se due package definiscono classi omonime possono essere importati entrambi
* La collisione si verifica solo quando si utilizzano gli elementi in conflitto

## Storage (directory)

La directory in cui il package risiede deve avere un path che corrisponde a quello del nome `java.util` <-> `java/util`

### Il path è relativo a uno dei percorsi di ricerca automatica definiti nella variabile di ambiente CLASSPATH

### Un sottoalbero di package può essere sostituito da un

* File zippato ( .zip)
* File archiviato ( .jar)
Esempio
CLASSPATH=c:\java\jdk\lib;c:\java\mylibs

## Visibilità

### Le regole di encapsulation / visibilità si applicano anche ai package


### Modificatori di visibilità

### Su attributi o metodi di classi entro
package
* private: visibile solo da istanze della stessa classe
* public: visibile da istanze di qualsiasi classe all'interno del package
  * anche da istanze all'esterno del package SE la classe è public
* package VALORE DI DEFAULT: visibile da istanze di qualsiasi classe, all'interno del package


### Classi all'interno di un package
* public: elementi (attributi metodi) public della classe sono visibili anche fuori dal package 
* package (VALORE DI DEFAULT): elementi (attributi metodi) public della classe sono visibili solo all'interno del package



## Java packages

* java.applet Provides the classes necessary to create an applet
and the classes an applet uses to communicate with
its applet context.

* java.awt Contains all of the classes for creating user
interfaces and for painting graphics and images.

* java.awt.color Provides classes for color spaces.

* java.awt.datatransfe Provides interfaces and classes for transferring data
between and within applications.
r

* java.awt.dnd Drag and Drop is a direct manipulation gesture
found in many Graphical User Interface systems
that provides a mechanism to transfer information
between two entities logically associated with
presentation elements in the GUI.

* java.awt.event Provides interfaces and classes for dealing with
different types of events fired by AWT
components.

* java.awt.font Provides classes and interface relating to fonts.

* java.awt.geom Provides the Java 2D classes for defining and
performing operations on objects related to two-
dimensional geometry.

* java.awt.im Provides classes and interfaces for the input method
framework.

* java.awt.im.spi Provides interfaces that enable the development of
input methods that can be used with any Java
runtime environment.

* java.awt.image Provides classes for creating and modifying
images.

* java.awt.image.rend Provides classes and interfaces for producing
rendering-independent images.
erable

* java.awt.print Provides classes and interfaces for a general
printing API.

* java.beans Contains classes related to developing beans --
components based on the JavaBeans TM architecture.
* java.beans.beancont Provides classes and interfaces relating to bean
context.
ext

* java.io Provides for system input and output through data
streams, serialization and the file system.

* java.lang Provides classes that are fundamental to the design
of the Java programming language.

* java.lang.ref Provides reference-object classes, which support a
limited degree of interaction with the garbage
collector.

* java.lang.reflect Provides classes and interfaces for obtaining
reflective information about classes and objects.

* java.math Provides classes for performing arbitrary-precision
integer arithmetic (BigInteger) and arbitrary-
precision decimal arithmetic (BigDecimal).

* java.net Provides the classes for implementing networking
applications.

* java.nio Defines buffers, which are containers for data, and
provides an overview of the other NIO packages.

* java.nio.channels
Defines channels, which represent connections to
entities that are capable of performing I/O
operations, such as files and sockets; defines
selectors, for multiplexed, non-blocking I/O
operations.

* java.nio.channels.spi Service-provider classes for the

* java.nio.channels package.

* java.nio.charset
Defines charsets, decoders, and encoders, for
translating between bytes and Unicode characters.

* java.nio.charset.spi Service-provider classes for the 
* java.nio.charset
package.

* java.rmi Provides the RMI package.

* java.rmi.activation Provides support for RMI Object Activation.

* java.rmi.dgc Provides classes and interface for RMI distributed
garbage-collection (DGC).

* java.rmi.registry
Provides a class and two interfaces for the RMI
registry.

* java.rmi.server Provides classes and interfaces for supporting the
server side of RMI.

* java.security Provides the classes and interfaces for the security
framework.

* java.security.acl The classes and interfaces in this package have
been superseded by classes in the 
* java.security
package.

* java.security.cert
Provides classes and interfaces for parsing and
managing certificates, certificate revocation lists
(CRLs), and certification paths.

* java.security.interfa Provides interfaces for generating RSA (Rivest,
Shamir and Adleman AsymmetricCipher
ces
algorithm) keys as defined in the RSA Laboratory
Technical Note PKCS#1, and DSA (Digital
Signature Algorithm) keys as defined in NIST's
FIPS-186.
the plug-in interfaces for readers, writers,
transcoders, and streams, and a runtime registry.

* java.security.spec Provides classes and interfaces for key
specifications and algorithm parameter
specifications.

* java.sql Provides the API for accessing and processing data
stored in a data source (usually a relational
database) using the Java TM programming language.

* javax.imageio.strea
m A package of the Java Image I/O API dealing with
low-level I/O from files and streams.

* javax.naming Provides the classes and interfaces for accessing
naming services.

* javax.naming.direct Extends the 
* javax.naming package to provide
functionality for accessing directory services.
ory

* java.text Provides classes and interfaces for handling text,
dates, numbers, and messages in a manner
independent of natural languages. 
* java.util Contains the collections framework, legacy
collection classes, event model, date and time
facilities, internationalization, and miscellaneous
utility classes (a string tokenizer, a random-number
generator, and a bit array). 
* javax.naming.ldap Provides support for LDAPv3 extended operations
and controls.

* javax.naming.spi Provides the means for dynamically plugging in
support for accessing naming and directory services
through the 
* javax.naming and related packages.
Provides classes for reading and writing the JAR
(Java ARchive) file format, which is based on the
standard ZIP file format with an optional manifest
file. 
* javax.net Provides classes for networking applications.

* javax.net.ssl Provides classes for the secure socket package.

* javax.print Provides the principal classes and interfaces for the
JavaTM Print Service API.

* java.util.jar
TM

* java.util.logging Provides the classes and interfaces of the Java
platform's core logging facilities.

* java.util.prefs This package allows applications to store and
retrieve user and system preference and
configuration data.

* java.util.regex Classes for matching character sequences against
patterns specified by regular expressions.

* java.util.zip Provides classes for reading and writing the
standard ZIP and GZIP file formats.

## Java extension packages

* javax.accessibility Defines a contract between user-interface
components and an assistive technology that
provides access to those components.

* javax.crypto Provides the classes and interfaces for
cryptographic operations.

* javax.crypto.interfa Provides interfaces for Diffie-Hellman keys as
defined in RSA Laboratories' PKCS #3.
ces

* javax.crypto.spec Provides classes and interfaces for key
specifications and algorithm parameter
specifications.

* javax.imageio The main package of the Java Image I/O API.

* javax.imageio.event A package of the Java Image I/O API dealing with
synchronous notification of events during the
reading and writing of images.

* javax.imageio.metad A package of the Java Image I/O API dealing with
reading and writing metadata.
ata

* javax.imageio.plugin Classes supporting the built -in JPEG plug-in.
s.jpeg

* javax.imageio.spi
A package of the Java Image I/O API containing

* javax.naming.event Provides support for event notification when
accessing naming and directory services.

* javax.print.attribute Provides classes and interfaces that describe the
types of JavaTM Print Service attributes and how
they can be collected into attribute sets.

* javax.print.attribute Package 
* javax.print.attribute.standard contains
classes for specific printing attributes.
.standard

* javax.print.event Package 
* javax.print.event contains event classes
and listener interfaces.

* javax.rmi Contains user APIs for RMI-IIOP.

* javax.rmi.CORBA Contains portability APIs for RMI-IIOP.

* javax.security.auth This package provides a framework for
authentication and authorization.

* javax.security.auth.c This package provides the classes necessary for
services to interact with applications in order to
allback
retrieve information (authentication data including
usernames or passwords, for example) or to display
information (error and warning messages, for
example).

* javax.security.auth. This package contains utility classes related to the
Kerberos network authentication protocol.
kerberos

* javax.security.auth.l This package provides a pluggable authentication
framework.
ogin

* javax.security.auth.s This package provides the interface to be used for
implementing pluggable authentication modules.
pi

* javax.security.auth. This package contains the classes that should be
used to store X500 Principal and X500 Private
x500
Crendentials in a Subject.

* javax.security.cert Provides classes for public key certificates.

* javax.sound.midi Provides interfaces and classes for I/O, sequencing,
and synthesis of MIDI (Musical Instrument Digital
Interface) data.
* javax.sound.midi.spi Supplies interfaces for service providers to
implement when offering new MIDI devices, MIDI
file readers and writers, or sound bank readers.
which allows the transaction manager to enlist and
delist resource objects (supplied by the resource
manager driver) in JTA transactions.

* javax.sound.sample Provides interfaces and classes for capture,
processing, and playback of sampled audio data.
d 
* javax.xml.parsers

* javax.sound.sample Supplies abstract classes for service providers to
subclass when offering new audio devices, sound
d.spi
file readers and writers, or audio format converters. 
* javax.xml.transform This package defines the generic APIs for
processing transformation instructions, and
performing a transformation from source to result.

* javax.sql Provides the API for server side data source access
and processing from the JavaTM programming
language.

* javax.swing Provides a set of "lightweight" (all-Java language)
components that, to the maximum degree possible,
work the same on all platforms.

* javax.swing.border Provides classes and interface for drawing
specialized borders around a Swing component.

* javax.swing.colorchooser Contains classes and interfaces used by the JColorChooser component.

* javax.swing.event Provides for events fired by Swing components.

* javax.swing.filechooser Contains classes and interfaces used by the JFileChooser component.


* javax.swing.plaf
Provides one interface and many abstract classes
that Swing uses to provide its pluggable look-and-
feel capabilities.

* javax.swing.plaf.bas Provides user interface objects built according to
the Basic look and feel.
ic

* javax.swing.plaf.met Provides user interface objects built according to
the Java look and feel (once codenamed Metal),
al
which is the default look and feel.

* javax.swing.plaf.mul Provides user interface objects that combine two or
more look and feels.
ti

* javax.swing.table Provides classes and interfaces for dealing with

* javax.swing.JTable.

* javax.swing.text Provides classes and interfaces that deal with
editable and noneditable text components.

* javax.swing.text.htm Provides the class HTMLEditorKit and supporting
classes for creating HTML text editors.
l

* javax.swing.text.htm Provides the default HTML parser, along with support classes.l.parser

* javax.swing.text.rtf Provides a class (RTFEditorKit) for creating Rich-Text-Format text editors.

* javax.swing.tree Provides classes and interfaces for dealing with javax.swing.JTree.

* javax.swing.undo Allows developers to provide support for undo/redo in applications such as text editors.

* javax.transaction Contains three exceptions thrown by the ORB
machinery during unmarshalling.

* javax.transaction.xa Provides the API that defines the contract between the transaction manager and the resource manager,