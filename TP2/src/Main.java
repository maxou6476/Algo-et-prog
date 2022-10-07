import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bienvenue dans le TP 2 de JAVA\n veuillez choisir un exercice en écrivant son numéro\n voici la liste :");
        boolean play = true;
        while(play)
        {
            System.out.println("\n1 - Discriminant\n2 - Parite d'un nombre\n3 - Calcul d’extremum\n4 - Égalité entre chaînes de caractères\n5 - Factorielle\n6 - Compte à rebours\n7 - Valeurs de carrés\n8 - Table de multiplication\n9 - Division d’entiers\n10 - Règle graduée\n11 - Nombres premiers\n12 - Manipulations sur un tableau\n13 - Quitter les exercices");
            System.out.println("choix : ");
            int choixEx = scanner.nextInt();
            switch (choixEx)
            {
                case 1:
                    System.out.println("Discriminant");
                    discriminant();
                    break;
                case 2:
                    System.out.println("Parite d'un nombre");
                    parite();
                    break;
                case 3:
                    System.out.println("Calcul d’extremum");
                    max();
                    break;
                case 4:
                    System.out.println("Égalité entre chaînes de caractères");
                    egaliteStr();
                    break;
                case 5:
                    System.out.println("Factorielle");
                    factorielle();
                    break;
                case 6:
                    System.out.println("Compte à rebours");
                    countdown();
                    break;
                case 7:
                    System.out.println("Valeurs de carrés\n");
                    carres();
                    break;
                case 8:
                    System.out.println("Table de multiplication");
                    tableMultiplication();
                    break;
                case 9:
                    System.out.println("Division d’entiers");
                    division();
                    break;
                case 10:
                    System.out.println("Règle graduée");
                    regle();
                    break;
                case 11:
                    System.out.println("Nombres premiers");
                    nombrePremier();
                    break;
                case 12:
                    System.out.println("Manipulations sur un tableau");
                    inverseTableau();
                    break;
                case 13:
                    System.out.println("fin des exercices");
                    play = false;
                    break;
                default:
                    System.out.println("ce choix ne figure pas sur la liste");
                    break;
            }

        }
        //discriminant();
        //parite();
        //max();
        //min();
        //egaliteStr();
        //factorielle();
        //countdown();
        //carres();
        //tableMultiplication();
        //division();
        //regle();
        //nombrePremier();
        //initialisationTableau();
        //inverseTableau();
    }


    //Exercice 1 calcul du discriminant
    public static void discriminant()
    {
        Scanner scanner = new Scanner(System.in);
        //récuperation des 3 valeurs a,b et c
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        //application de la formule
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0)
        {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
        if (delta == 0)
        {
            System.out.println("Une racine double trouvé");
            double x0 = -(double)b/(2*a);
            System.out.println("x0 vaut : " + x0);
        }
        if (delta > 0)
        {
            System.out.println("deux racines trouvés");
            double x0 = (-(double)b+Math.sqrt(delta))/(2*a);
            double x1 = (-(double)b-Math.sqrt(delta))/(2*a);
            System.out.println("x0 vaut : " + x0 + "\net x1 vaut : "+ x1);
        }
    }

    //Exercice 2 calcul de la parite d'un nombre
    public static void parite()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("saisissez un entier");
        int nbrEntier = scanner.nextInt();
        //vérification à l'aide d'un modulo 2, si il y a un "reste" c'est que le resultat est impaire
        if(nbrEntier%2 == 0)
            System.out.println("le nombre " + nbrEntier + " est pair");
        else
            System.out.println("le nombre " + nbrEntier + " est impair");
    }

    //Exercice 3 determiner le maximum ou le minimum entre 2 nombres
    public static void max()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("saisissez un entier : ");
        int nbr1 = scanner.nextInt();
        System.out.println("saisissez un deuxiéme entier : ");
        int nbr2 = scanner.nextInt();
        if(nbr1 > nbr2)
            System.out.println("le nombre " + nbr1 + " est le plus grand");
        else if(nbr2 > nbr1)
            System.out.println("le nombre " + nbr2 + " est le plus grand");
        else
            System.out.println("les deux nombres ont la même valeur");
    }

    public static void min()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("saisissez un entier : ");
        int nbr1 = scanner.nextInt();
        System.out.println("saisissez un deuxiéme entier : ");
        int nbr2 = scanner.nextInt();
        if(nbr1 < nbr2)
            System.out.println("le nombre " + nbr1 + " est le plus petit");
        else if(nbr2 < nbr1)
            System.out.println("le nombre " + nbr2 + " est le plus petit");
        else
            System.out.println("les deux nombres ont la même valeur");
    }

    //Exercice 4 égalité entre 2 chaînes de caractères
    public static void egaliteStr()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("merci de saisir une chaine de caractère : ");
        String chaine1 = scanner.nextLine();
        System.out.println("merci de saisir une deuxieme chaine de caractère : ");
        String chaine2 = scanner.nextLine();

        //comparaison de "chaine1" et 2 "chaine2", identique - majucule differente - non identique
        if(chaine1.equals(chaine2))
            System.out.println("ces deux chaines sont identiques");
            else if(chaine1.equalsIgnoreCase(chaine2))
                System.out.println("ces deux chaines n'ont pas les mêmes majuscules/minuscules");
            else
            System.out.println("ces deux chaines ne sont pas identiques");
    }

    //Exercice 5 structure itérative
    public static void factorielle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;

        for (int i = 1; i <= n; i++)
        {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    //Exercice 6 compte à rebours
    public static void countdown()
    {
        for (int i = 10;i > -1; i--)
        {
            System.out.println(i);
        }
        System.out.println("BOOM !");
    }

    //Exercice 7 valeurs de carrés
    public static void carres()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez un nombre entier :");
        int x = scanner.nextInt();
        int xcar = x*x;

        System.out.println("le carré de " + x + " est " + xcar);
    }

    //Exercice 8 tables de mutliplication
    public static void tableMultiplication()
    {
        for (int l = 1;l < 11;l++)
        {
            for (int h = 1;h < 11; h++)
            {
                int res = l*h;
                System.out.print(res + " ");
            }
            System.out.print("\n");
        }
    }

    //Exercice 9 division d'entiers
    public static void division()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez un entier : ");
        int e1 = scanner.nextInt();
        int e2 = 0;
        while (e2 == 0)
        {
            System.out.println("saisissez un deuxiéme entier différent de 0 : ");
            e2 = scanner.nextInt();
        }
        float resdiv = (float) e1/(float) e2;
        System.out.println("le résultat de " + e1 + "/" + e2 + " est :" + resdiv);
    }

    //Exercice 10 régle gradué
    public static void regle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez un entier : ");
        int longueur = scanner.nextInt();

        for (int i = 0;i < longueur+1;i++)
        {
            if (i%10 == 0)
                System.out.print("|");
                else
                    System.out.print("-");
        }
    }

    //Exercice 11 nombres premiers
    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int nbr = -1;
        while (nbr < 0)
        {
            System.out.println("saisissez un entier positif : ");
            nbr = scanner.nextInt();
        }
        int verif = 0;
        for (int i = 2;i < nbr;i++)
        {
            if (nbr % i == 0)
            {
                verif = 1;
                i = nbr;
            }
        }
        if (verif == 1)
            System.out.println(nbr + " n'est pas un nombre premier");
            else
                System.out.println(nbr + " est un nombre premier");
    }

    //Exercice 12 Manipulation de tableau
    public static void initialisationTableau()
    {
        int tablength = 5;
        int[] tableau = new int[tablength];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tableau.length; i++)
        {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        //valeur max
        int tmax = tableau[0];
        for (int i = 0;i < tablength;i++)
        {
            if(tableau[i] > tmax)
                tmax = tableau[i];

        }
        System.out.println("valeur max du tableau : " + tmax);
        System.out.print("\n");
        //valeur min
        int tmin = tableau[0];
        for (int i = 0;i < tablength;i++)
        {
            if(tableau[i] < tmin)
                tmin = tableau[i];
        }
        System.out.println("valeur min du tableau : " + tmin);
        System.out.print("\n");
        //valeur pair
        for (int i = 0;i < tablength;i++)
        {
            if (tableau[i] % 2 == 0)
            {
                System.out.print(tableau[i] + " ");
            }

        }
        System.out.print("\n");
        //valeur de l'indice des élements pairs
        for (int i = 0;i < tablength;i++)
        {
            if (tableau[i] % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
    //Exercice 12bis inversion d'un tableau
    public static void inverseTableau()
    {
        Scanner scanner = new Scanner(System.in);
        //création du tableau
        int tablength = 5;
        int[] tableau = new int[tablength];
        for (int i = 0;i< tableau.length;i++)
        {
            System.out.println("saisissez un entier : ");
            tableau[i] = scanner.nextInt();
        }

        System.out.print("affichage du tableau avant : ");
        for (int i = 0;i< tableau.length;i++)
        {
            System.out.print(tableau[i]+ " ");
        }
        //inversion du tableau
        for (int i = 0;i<tableau.length / 2;i++)
        {
            int vinit = tableau[i];
            int vfinal = tableau[tableau.length - i - 1];
            tableau[i] = vfinal;
            tableau[tableau.length - i - 1] = vinit;
        }
        System.out.print("\naffichage du tableau aprés : ");
        for (int i = 0;i< tableau.length;i++)
        {
            System.out.print(tableau[i] + " ");
        }

    }

}
