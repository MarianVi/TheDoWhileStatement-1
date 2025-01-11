Folosind instrucțiunea do-while, implementează un joc în care utilizatorul trebuie să ghicească un număr magic. Astfel, variabila int numarMagic va fi citită de la tastatură, fiind o valoare întreagă, în intervalul [0, 10]. Ulterior, utilizatorul va introduce numere de la tastatură iar programul tău îi va da acestuia indicații despre numărul introdus:

    1. Dacă numărul introdus nu se află în interval, programul va afișa mesajul:
      Atentie! Numarul magic se afla in intervalul [0, 10]
    2. Dacă numărul este mai mare decât numărul magic, programul va afișa mesajul:
      Esti aproape! Dar numarul magic este mai mic.
    3. Dacă numărul introdus este mai mic, se va afișa:Esti aproape! Dar numarul magic este mai mare.
    4. Când numărul este ghicit, se va afișa: Ai ghicit, bravo!

Exemplu de rulare:

Console

    # numarMagic == 5
    Bun venit! Te invitam sa ghicesti numarul, aflat in intervalul [0, 10]
    Incearca-ti norocul:
    -3
    Atentie! Numarul magic se afla in intervalul [0, 10]
    Incearca-ti norocul:
    3
    Esti aproape! Dar numarul magic este mai mare.
    Incearca-ti norocul:
    10
    Esti aproape! Dar numarul magic este mai mic.
    Incearca-ti norocul:
    8
    Esti aproape! Dar numarul magic este mai mic.
    Incearca-ti norocul:
    5
    Ai ghicit, bravo!

