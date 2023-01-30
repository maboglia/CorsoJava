# Esercizi Java - Metodi avanzati


## Esercizio  Calcolo del fattoriale ricorsivo

Scrivere un programma che contenga un metodo
ricorsivo per il calcolo del fattoriale.

---

## Esercizio interfacce

A partire dall'**interfaccia Animale**, che definisce
i metodi **faiVerso()** e **dimmiCiboPreferito()**,
implementare le classi **Gatto**, **Cane** e **Topo**
attraverso l'uso delle interfacce.

---

## Esercizio classi astratte

A partire dalla **classe Animale**, che definisce i
metodi **faiVerso()**, implementare le classi **Gatto**,
**Cane** e **Topo** attraverso l'uso dell'astrazione.

---

## 1) Dato il seguente programma:

```java

class Q
{
public static void main(String arg[])
{
int a=5;
int b=2;
System.out.println((a+0.0f)/b);
System.out.println(a/(b*1.0));
System.out.println(a/b);
}
}
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1. stampa: 2 2 2
2. stampa: 2 2.5 2
3. stampa: 2.5 2.5 2.5
4. stampa: 2.5 2.5 2
5. stampa: 2.5 2 2
6. nessuna delle precedenti

---

## 2) Dato il seguente programma:

```java

class Test {
public static void main(String args[]) {
int i,j=0;
for(i=0;i<3;i++) { j++;
switch(j) {
case (0) :
j=j+1;
case(1):
j=j+2;
case (2) :
j=j+3;
break;
case (6) :
j=j+10;
break;
default :
break;
}}
System.out.println(j);
}
}
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1. stampa: 2
2. stampa: 5
3. stampa: 8
4. stampa: 16
5. nessuna delle precedenti

---

## Dato il seguente programma

```java
class Q
{
public static void main(String arg[])
{
int a[]={2,1};
a[a[0]]=a[0];
System.out.println(a[0]);
System.out.println(a[1]);
}
}
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1. stampa: 2 1
2. stampa: 2 2
3. errore di esecuzione
4. errore di compilazione

---

## 4) Data la seguente classe

```java
class Q {
private String name;
public Q(String name) {this.name = name;}
public void setName(String name) {this.name = name;}
public String getName() {return name;}
public static void m1(Q a,Q b) {
a = new Q("obj1");
b.setName("obj2");
}
}
class MainClass{
public static void main (String[] args) {
Q a1= new Q("obj3");
Q a2= new Q("obj4");
System.out.println(a1.getName()+" "+a2.getName());
Q.m1(a1,a2);
System.out.println(a1.getName()+" "+a2.getName());
}}
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1.stampa:
    obj3 obj4
    obj1 obj2
2.stampa:
    obj3 obj4
    obj3 obj4
3.stampa:
    obj3 obj4
    obj1 obj4
4.stampa :
    obj3 obj4
    obj3 obj2
5.errore di compilazione
6.errore di esecuzione
7.nessuna delle precedenti

---

## 5) Date le seguenti classi

```java
class A
{
void callme()
{
System.out.println("A");
}
}
class B extends A {
public void callme()
{
System.out.println("B");
}
}
class Q
{
public static void main(String args[])
{
B a = new B();
a.callme();
A b = new A();
b.callme();
A b1= new B();
b1.callme();
}
}
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1. stampa B A A
2. stampa B A B
3. errore di compilazione
4. errore di esecuzione

---

## 6) Date le seguenti classi

```java
class A {A(int i) {}} // 1
class B extends A {B(){super();}} // 2
class C extends B { } // 3
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1. errore di compilazione
2. errore di esecuzione
3. nessun errore

---

## 7) Date le seguenti classi

```java
class B extends D {}
class D implements Int4 {}
interface Int3 extends Int4 {}
class C implements Int3 {}
class A extends C {}
interface Int4 {}
public MainClass {
public static void main(String arg[]) {
B b=null;
D d=null;
Int4 i4=null;
Int3 i3=null;
C c=null;
A a=null;
// ISTRUZIONE QUI
}
}
```

Quali delle seguenti istruzioni possono essere inserite a posto del commento ?
1. i4=a;
2. c=i4;
3. d=a;
4. i3=a;
5. i4=i3;

---

## 8) Date le seguenti classi appartenenti a tre package distinti

```java
public class B
{
private int x;
public B(){
x=10;
}
<??????> void setX(int x){
this.x=x;
}
}
public class A extends B
{
public void m2(){
setX(5) ;
}
}
public class C
{
public void m2(){
A a=new A() ;
a.setX(5);
}
}
```

Come deve essere dichiarato il metodo setX di B affinchè la compilazione della classe A vada a
buon fine e la compilazione della classe C dia errore ?

1. protected
2. public
3. private

---

## 9) Date le seguenti classi

```java
public abstract class C{
public abstract void m1();
public abstract void m2();
public abstract void m3();
}
public abstract class B extends C{
public void m1() {
System.out.println("B.m1()");
}
public abstract void m2();
}
public class A extends B{
public void m2(){
System.out.println("A.m2()");
}
}
public class MainClass{
public static void main(String args[]){
C b=new A();
b.m2();
}
}
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1. stampa: “A.m2()”
2. stampa: “”
3. errore a tempo di esecuzione
4. errore di compilazione

---

## 10) Dato il seguente programma

```java
class Test {
public static void main(String args[]) {
int a[]=new int[2];
String s=null;
for (int j=0;j<3;j++){
try {
int i=1/(1-j);
a[j]++;
char b=s.charAt(i);
}
catch(NullPointerException e) {
System.out.println("a");
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("b");
}
catch(Exception e) {
System.out.println("c");
}
}
}
}
```

Qual è il risultato della compilazione ed esecuzione del programma ?

1. errore di compilazione
2. errore di esecuzione
3. stampa: abc
4. stampa: ccc
5. stampa: aaa
6. stampa: acb
7. stampa: bca
