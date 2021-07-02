package com.picojo.phrases;

import com.picojo.settings.Settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Phrases {
    private static List<String> phrases = new ArrayList();

    public static void reset() {
        phrases.clear();

        //Actions
        phrases.add("%s Mets tes bas dans tes mains pour 6 questions. si tu n'a pas de mains/bas tu chug");
        phrases.add("%s commence le WWWATERFALL!");
        phrases.add("%s Donne le nombre de gorgé que tu tes cassé d'os");
        phrases.add("%s si tu n'a pas de chien prend 2 gorgée");
        phrases.add("%s si tu est jamais aller au mephisto boit 6 gorgée");
        phrases.add("%s vériter ou conséquence");
        phrases.add("%s texte ta maman que tu l'aime vraiment beaucoup");
        phrases.add("%s fait un massage a ton voisin de gauche ou prend 4 gorgés");
        phrases.add("La deriere personne châpeau pointu s'assis par terre pour 6 questions");
        phrases.add("La plus grande personne prend 4 gorgées");
        phrases.add("Ceux qui porte des lunettes prennent 2 gorgées");
        phrases.add("Ceux qui ne porte pas des lunettes prennent 2 gorgées");
        phrases.add("%s boit autend de gorgées qu'il y a de fille présente");
        phrases.add("Prend 3 gorgées si t'es déjà aller au Méphisto");
        phrases.add("Les invités prennent 2 gorgées");
        phrases.add("L'hote' prend 2 gorgées");
        phrases.add("Tous ceux qui ont fait un arbre de noel cette année prenne 3 gorgées");
        phrases.add("Tout le monde prend autant de gorgées que d'année d'étude post-secondaire");
        phrases.add("La derniere personne qui a ouvert un bière prend 2 gorgées");
        phrases.add("%s choisi la prochaine chanson");
        phrases.add("%s Choisi qui entre %s et %s doit finir ça consommation");
        phrases.add("Pendant 10 minutes %s doit servir les consommations");
        phrases.add("Tout ceux qui on un écran craqué prenne 2 gorgées");
        phrases.add("L'hote du jeux distribue 3 gorgées");
        phrases.add("Si tu déjà a perdu ton cellulaire et que tu ne la jamais retrouver prend 3 gorgées sinon distribu 3 gorgées");
        phrases.add("%s choisi un object dans la pièce. Le premier a y touché distribu 4 gorgées");
        phrases.add("%s distribue autant de gorgées que tu a fini de consommation");
        phrases.add("La premiere personne a liché sont coude distribue 6 gorgées");
        phrases.add("%s distribue 2 gorgées ou laisse %s prendre 3 gorgées");
        phrases.add("Celui qui a les plus grande mains entre %s et %s distribue 2 gorgées");
        phrases.add("%s fait une imitation de Chewbaca ou prend 3 gorgées");
        phrases.add("La personne avec les plus longs cheveux prend 2 gorgées");
        phrases.add("Si tu n'a jamais pass-out, prend 3 gorgées");
        phrases.add("%s choisi une couleur. Tout ceux qui ont un vetement de cette couleur prennent 2 gorgées");
        phrases.add("La personne la plus petite distribue 3 gorgées");
        phrases.add("La premiere personne a identifé le joueur le plus jeune distribu 5 gorgées");
        phrases.add("%s distribue et prend autant de gorgées que tu a de frère ou soeur.");
        phrases.add("%s devine le sport préféré de %s. Prend 2 gorgées si tu te trompe. Distribue 3 gorgées si tu réussi.");
        phrases.add("Tout ceux qui on fumé aujourd'hui prenne 2 gorgées.");
        phrases.add("La dernière personne arrivé prend 3 gorgées.");
        phrases.add("Les personnes en couple prennent 2 gorgées.");
        phrases.add("Prend 2 gorgées si tu a déjà volé quelque chose a quelqu'un a la table.");
        phrases.add("Distribue 2 gorgées si tu a déjà manger chez %s.");
        phrases.add("Prend 2 gorgées si tu chante dans la douche.");
        phrases.add("%s prend autant de gorgées que tu veux puis distribue en autant");
        phrases.add("%s et %s prenne 2 gorgées dans le drink de l'autre");
        phrases.add("1 gorgées pour tout le monde! Cheers!");
        phrases.add("Le plus musclé prend 3 gorgée.");
        phrases.add("Le moins musclé prend 3 gorgée.");
        phrases.add("%s nomme 2 chansons de Justin Bieber et donne 3 gorgées sinon bois les");
        phrases.add("Le joueur avec le moins d'alcool dans son vert doit le finir.");
        phrases.add("%s nomme autant de défault a %s que tu veux puis distribue autant de gorgées.");
        phrases.add("%s prend autant de gorgées que tu veux. %s doit t'égaler.");
        phrases.add("La personne la plus poilus distribue 3 gorgées.");
        phrases.add("%s prend 3 gorgées. La personne a ta droite prend 1 gorgée de moins et ainsi de suite.");
        phrases.add("%s donne 2 gorgées a quelqu'un de plus grand que toi. Si impossible prend les!");
        phrases.add("%s donne 2 gorgées a quelqu'un de plus petit que toi. Si impossible prend les!");
        phrases.add("%s donne 2 gorgées a %s ou 4 a %s");
        phrases.add("%s nomme une chose que tu na jamais fait. Tout ceux qui l'on déjà fait prenne 4 gorgées");
        phrases.add("La dernière personne qui a pris l'avion distribue 3 gorgées.");
        phrases.add("%s, tu a 3 secondes pour dire le nombre de personne présebt dans la piece. Prend 5 gorgées en cas d'éhcec.");
        phrases.add("%s dit une phrase d'un filme, le premier a devenier le film distribue 4 gorgées.");
        phrases.add("Le DJ distribue 3 gorgées.");
        phrases.add("%s donne 2 gorgées a la personne que tu connais le mieux.");
        phrases.add("Prend 3 gorgées si tu a déja travailler dans un camp d'été");
        phrases.add("%s, fait une action décidé par %s ou prend 4 gorgées.");
        phrases.add("Prend 3 gorgées si t'es jamais aller au subway un landemain de brosse");
        phrases.add("Prend 3 gorgées si tu t'es déja fait arrêter.");

        //Question
        phrases.add("%s, qui vomit le plus souvent entre %s et %s. Celui qui vomit le moins souvent prend 3 gorgées");
        phrases.add("%s, qui prendrait tu comme partenaire de spikeball? %s ou %s? Ton partenaire distribue 3 gorgées");
        phrases.add("%s, qui prendrait tu comme partenaire de beer pong? %s ou %s? Ton partenaire distribue 3 gorgées");
        phrases.add("%s, qui est le meilleur joueur d'échec? %s ou %s? Le meilleur distribue 3 gorgées");
        phrases.add("%s, qui est le meilleur conducteur? %s ou %s? Le meilleur distribue 3 gorgées");
        phrases.add("%s, qui est le meilleur menteur? %s ou %s? Le meilleur distribue 2 gorgées");
        phrases.add("%s, qui est le moins fiable? %s ou %s? Le moins fiable prend 2 gorgées");
        phrases.add("%s, qui est les plus beau yeux? %s ou %s? Le gagant prend 1 et distribue 2 gorgées");
        phrases.add("%s, qui a les meilleurs gout musicaux? %s ou %s? Le gagant prend 1 et distribue 2 gorgées");
        phrases.add("%s, qui serait le meilleur acteur? %s ou %s? Le gagant prend 1 et distribue 3 gorgées");
        phrases.add("%s, qui est le plus intraverti? %s ou %s? Le plus intraverti prend 3 gorgées");

        //Action ou conséquence.
        phrases.add("%s tient sur tes mains pendant 5 secondes ou prend 5 gorgées");
        phrases.add("%s fait 20 squats ou prend 4 gorgées");
        phrases.add("%s laisse %s refaire ta coupe de cheuveux ou prend 3 gorgées");
        phrases.add("Pendant 5 minutes, %s parle avec un accent congolais ou prend 6 gorgées");
        phrases.add("%s fait un massage a %s ou prend 4 gorgées");
        phrases.add("%s fait la larve ou prend 4 gorgées");
        phrases.add("%s choisi une chanson et fait une chorégraphie puis distribue 6 ou prend 4 gorgées");
        phrases.add("%s dévoile une de tes addictions ou prend ou prend 4 gorgées");
        phrases.add("%s fait un grand écart  ou prend 2 gorgées");
        phrases.add("%s racontre une blague  ou prend 4 gorgées");

        //Jeux
    
        phrases.add("Flip the cup: Le premier qui échoue prend autant de gorgé qu'il y a eu de réussite");
        phrases.add("Le dernier a mettre son pouce sur la table après %s prend 5 gorgées");
        phrases.add("%s dit quelque chose que tu n'aime pas. Tous ceux qui aime prenne 2 gorgées");
        phrases.add("'Un artiste décédé' Le premier qui n'en connait pas prend 3 gorgées. %s commence");
        phrases.add("'Nom de supermarché' Le premier qui n'en connait pas prend 3 gorgées. %s commence");
        phrases.add("Celui qui fait le plus de push-ups entre %s et %s distribue 6 gorgées");
        phrases.add("%s %s Roche papier ciseaux. Le perdant prend 2 gorgées");
        phrases.add("%s pose une question. Le premier a trouvé la réponse distribue 3 gorgées.");
        phrases.add("Téléphone: Chuchotte un mots dans l'oreille de ton voisin de gauche. Après le tour de table celui qui c'est tromper prend 4 gorgées. %s commence");
        phrases.add("Vérité ou conséquence: %s commence vers sa droite. Le premier qui refuse prend 3 gorgées.");
        phrases.add("Dit le nom de famille de la personne a ta gauche. Le premier qui se trompe prend 3 gorgées. %s commence");
        phrases.add("%s, dit une lettre. Chaque personne ajoute une lettre. La premiere personne a finir le mots distribue 3 gorgées");
        phrases.add("%s fait un autobus");
        phrases.add("%s pense a un object dans la piece. La premiere personne a deviner distribue 3 gorgées");
        phrases.add("Dit l'age de la personne a ta gauche. 3 Gorgées au premier qui se trompe. %s commence");

        //Votes
        phrases.add("Vote: Le plus dangereux entre %s et %s prend 3 gorgées");
        phrases.add("Vote: Le moins sportif prend 4 gorgées");
        phrases.add("Vote: Écouter un films en boucle ou une chanson en boucle pendant 1 journée? Les perdant prennent 3 gorgées");
        phrases.add("Vote: Qui a la plus belle coupe de cheveux entre %s et %s. Le perdant prend 2 gorgées. Le gagnant distribue 2 gorgées");
        phrases.add("Vote: Qu'est ce qui est le plus essentiel. Du savon ou une voiture? Les perdant prennent 2 gorgées.");
        phrases.add("Vote: Ne plus avoir besoin de dormir ou ne plus avoir besoin de travailler? Les perdant prennent 3 gorgées.");
        phrases.add("Vote: Préfèrais tu travailler pour Amazon ou Google? Les perdant prennent 3 gorgées.");
        phrases.add("Vote: Un monde sans musique ou sans films? Les perdant prennent 3 gorgées.");

        //Règles
        phrases.add("Règle: Le prochain qui regarde son cell prend 4 gorgées");
        phrases.add("Règle: Le prochain qui dit 'bière' prend 4 gorgées");
        phrases.add("Règle: Le prochain qui va au toilette prend 6 gorgées");
        phrases.add("Règle: Le prochain qui parle a %s prend 3 gorgées");
        phrases.add("Règle: %s le prochain a te regarder dans les yeux prend 4 gorgées.");
        phrases.add("Règle: Chaque fois que %s dit 'marco', % doit répondre 'polo' sinon il prend 2 gorgées");
        phrases.add("Règle: Pendant 10 minutes, chaque fois que %s parle a %s ou %s, il prend 3 gorgées");
        phrases.add("Règle: Pendant 5 minutes, %s parle avec un accent congolais ou prend 6 gorgées");
        phrases.add("Règle: Pour les 3 prochaines question, les gorgées prise et distribuer sont inversé.");
        phrases.add("Règle: %s devient la bitch de %s pendant 5 minutes. La bitch doit toujours boire avec son maitre.");

        phrases.addAll(Settings.getPhrases());
    }

    public static String getRandom() {
        String phrase = getRandomPhrase();
        Integer playersRequired = getNumberOfPlayerRequired(phrase);

        while (Settings.getPlayerCount() < playersRequired) {
            phrase = getRandomPhrase();
            playersRequired = getNumberOfPlayerRequired(phrase);
        }

        return String.format(phrase, Settings.getRandomPlayers(playersRequired));
    }

    private static String getRandomPhrase() {
        Random rand = new Random();
        return phrases.get(rand.nextInt(phrases.size()));
    }

    private static Integer getNumberOfPlayerRequired(String phrase) {
        return Integer.valueOf(phrase.split("%s", -1).length-1);
    }
}
