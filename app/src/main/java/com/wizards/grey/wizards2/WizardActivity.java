package com.wizards.grey.wizards2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class WizardActivity extends ActionBarActivity {

    //This is a TEMPORARY measure to be replaced with a SQL database

    public String firstName [] = new String[] {"Grey", "Mary", "Dannel", "Lauren", "Carl", "Jon", "Jake", "Sophie", "Steve", "Mike", "Zanzibar", "Zordo", "Kemba", "Troy", "Tagata", "Odin", "Keebler", "Delphi", "Magula", "Haruspex", "Jibbly", "Myreh", "Cuch", "Rambo", "Ridley", "Whisper", "Dark", "Solid", "Sam", "Mavunga", "Folder", "Zebra", "Bill", "Harry", "Nancy", "Perry", "Cootis", "Booty", "Dude", "Stud", "Chester", "Wrathun", "Tzarbesk", "Jax", "Billford", "Travis", "Otis", "Lucky", "Scaramax", "Pog", "Valen", "Fargus", "Vox", "Taiga", "Iago", "Barrus", "Dorn", "Quax", "Shoo'", "McChippin", "Zardo", "Ear", "Bur", "Hoot", "Qwop", "Flonga", "Petunia", "Emerald", "Superfine", "Jack", "Ketamine", "Schult", "Pepper", "Salty", "Zanzibar", "Charles", "Quiet", "Rupple", "Figgy", "Cougar", "KoKo", "Mesh", "Yut Yut", "Gun", "Rabouille", "Chauncy", "Alfalser", "Action", "Shrek", "Bart", "Emi", "Billow", "Slammer", "Ernest", "Zebulon", "Xander"};
    public String lastName [] = new String[] {"Zanzibar", "O'Toole", "Fredericks", "DarkMajik", "Fisher", "Hopkins", "Chapin", "Smith", "Tuoni", "Lopardo", "McCracken", "Gatha", "Mo-Jimbo", "BunHart", "Travis", "Westro", "Macbeth", "Shakespeare", "Rumblo", "Hosher", "Ghirardello", "Frimp", "Xenikat", "Katepon", "Lain", "Berry", "Forgrave", "Serious", "Snake", "Robilard", "Keening", "SpaceLord", "Der'Shaunqua", "Bronco", "Ender", "Dudely", "Studly", "Cheetos", "Karakun", "Beaufort", "Trip", "Redding", "Pearson", "Jetto", "Farragut", "Voltar", "Kekumel", "Vorthack", "Jergen", "Plargus", "Go'Pingo", "Weego", "Bunka", "Alminister", "Jacarta", "Ma-yun", "Terminus", "Groll", "Pharlegon", "Olidon", "Osirus", "Xenakis", "Fipkins", "No. 39", "D'Woop", "Sullivan", "Capricorn", "Libra", "Cancer", "Yamata", "Whoa-Nelly", "Chipperson", "Jack", "Pepper", "AMERICA", "Tupkin", "Diffy", "Nibblin'", "Ruffles", "Uuiiaag", "Chibi", "Jhulta", "Barkley", "Paterson", "Ilmay", "Billows", "Pnoins", "Jackson", "Ogre", "Shorts", "Rusha", "Hornswoggle", "Jammer", "Fairfield", "Wheatley", "Shantago"};
    public String nouns[] = new String[] {"Knight", "Lord", "Lady", "King", "Duke", "Duchess", "Baron", "Princess", "Prince", "Queen", "Baroness", "Magister", "Magistrix", "Master", "Mistress", "Commander", "Captain", "Administrator", "Doctor", "Punk", "Lawyer", "Hero", "Dude", "Jerk", "Wizard", "President", "Prime Minister", "Speaker", "Vice President", "Congressman", "Senator", "Slave", "Officer", "Dispatcher", "Theif", "Prisoner", "Assassin", "Criminal", "Chef", "Father", "Mother", "Sister", "Brother", "Aunt", "Uncle", "Janitor", "Niece", "Nephew", "Champion", "Judge", "Citizen", "Scientist", "CEO", "Vendor", "Cat", "Mouse", "Rat", "Vermin", "Insect", "Beetle", "Bees", "Wasp", "Worm", "Maggot", "Zombie", "Dragon", "Griffon", "Manticore", "Ghoul", "Lich", "Arch Lich", "Ghost", "Skeleton", "Spider", "Hunter", "Killer", "Mage", "Hedge Mage", "Archmage", "Scholar", "Engineer", "Arcanist", "Gladiator", "Gladiatrix", "Necromancer", "Ne'er-do-well", "Magistrate", "Fairy", "Goblin", "Land Shark", "Kitten", "Dog", "Puppy", "Hound", "Wolf", "Tiger", "Lion", "Wildebeest", "Eagle", "Elephant", "Gopher", "Rhino", "Fox", "Dreadnaught", "Juggernaut", "Man", "Woman", "Human", "Child", "Person", "Chameleon", "Albatross", "Shark", "Jellyfish", "Fool", "Dummy", "Doofus", "Genius", "Owl", "Pigeon", "Snake", "Cobra", "Hamster", "Leopard", "Horse", "Salamander", "Hedgehog", "Echidna", "Squirrel", "Alien", "Buffalo", "Beaver", "Dolphin", "Preacher", "Concubine", "Laddy", "Dwarf", "Elf", "Troll", "Idiot", "Berserker", "Moose", "Goose", "Mummy", "Spectre", "Thug", "Dragonfly", "Kobold", "Watcher", "Penguin", "Glutton", "Businessman", "Businesswoman", "Police Officer", "Secret Agent", "Bear", "Grizzly", "Wombat", "Pony", "Donkey", "Monkey", "Gorilla", "Hummingbird", "Chimpanzee", "Tentacle", "Rapper", "Singer", "Dancer", "Artist", "Painter", "Writer", "Moron", "Lunatic", "Clerk", "Field", "Demon", "Devil", "Angel", "Athlete", "Wrestler", "Grandmaster", "Locksmith", "Anarchist", "Loser", "Winner", "Duck", "Salesman", "Gibbon", "Cross-dresser", "Puppeteer", "Lizard", "Anaconda", "Tarantula", "Scorpion", "Bat", "Serf", "Centipede", "People", "Blaster", "Game", "Puzzle", "Whip", "Flail", "Zweihander", "Cannon", "Gun", "Goblet", "Prayer", "Shout", "Scream", "Bell", "Apple", "Cucumber", "Mint", "Candy", "Knife", "Spike", "Bridge", "Ladder", "Hole", "Pit", "Portal", "Gate", "Door", "Fence", "Wall", "Egg", "Sun", "Moon", "Stars", "Airplane", "Helicopter", "Number", "Curse", "Butt", "Party", "Beer", "Wine", "Liquor", "Vodka", "Kiwi", "Strawberry", "Brick", "Hotdog", "Sausage", "Ear", "Arm", "Foot", "Leg", "Head", "Eye", "Nose", "Crotch", "Boat", "Ark", "Computer", "Vidya", "Leotard", "Piano", "Harp", "Trumpet", "Xylophone", "Cupcake", "Brownie", "Yogurt", "Pad", "Mask", "Hat", "Gloves", "Pants", "Helmet", "Gauntlets", "Chips", "Box", "Phone", "Massacre", "Tent", "Nail", "Jail", "Topic", "Wilderness", "Attack", "Fraud", "End Times", "Ink", "Armageddon", "Drugs", "Chair", "Machine", "Showdown", "Illusion", "Thing", "Thingy", "Equipment", "Armor", "Shield", "Sword", "Mace", "Hammer", "Spear", "Wotsit", "Button", "Question", "Omen", "Sign", "Tree", "Bushes", "Chariot", "Balls", "Couch", "Train", "Kaboose", "Tank", "Tankard", "Stein", "Urn", "Mafia", "Ruse", "Hamburger", "Recliner", "Cheeseburger", "Spaghetti", "Meat", "Vegetable", "Potato", "Pencil", "Goggles", "Widgit", "Rampage", "Dream", "Day and Age", "Facility", "Laboratory", "Tundra", "Mountain", "Forest", "Skies", "Space", "Party", "Gym", "Passage", "Hells", "Heavens", "Hill", "Territory", "Country", "World", "Globe", "Workshop", "Kingdom", "Swamp", "Plain", "Island", "Ocean", "Lake", "River", "Stream", "Meadow", "Field", "Wood", "Glade", "Copse", "Orchard", "City", "Town", "Suburb", "Burg", "Countryside", "Shelter", "Volcano", "Factory", "Corporation", "Capitol", "College", "School", "Taiga", "Ravine", "Marsh", "Desert", "Office", "Bunker", "Complex", "Mall", "Hospital", "Mental Ward", "Bedroom", "Bathroom", "Kitchen", "Civilization", "Society", "Closet", "Garage", "Pit", "Hole", "Fissure", "Valley", "Park", "Foothills", "Cave", "Arctic", "Blast", "Explosion", "Cone", "Sphere", "Cube", "Zone", "Area", "String", "Matrix", "Bolt", "Illusion", "Lace", "Heap", "Beam", "Laser", "Fireball", "Burst", "Splurt", "Lance", "Wave", "Ripple", "Concussion", "Epicentre", "Impact", "Strike", "Lattice", "Orb", "Target", "Mark", "Seal", "Binding", "Hunger", "Thirst", "Yearning", "Desire", "Passion", "Lust", "Incongruity", "Madness", "Insanity", "Love", "Confusion", "Randomization", "Meditation", "Evocation", "Apparition", "Transmutation", "Conjuration", "Necromancy", "Generation", "Incantation", "Stealth", "Glory", "Worthiness", "Imbalance", "Purpose", "Passage", "Modern Times", "Destruction", "Migration", "Wrath", "Anger", "Vengeance", "Justice", "Freedom", "Punishment", "Damnation", "Employment", "Gluttony", "Sacrifice", "Abilities", "Nature", "Disease", "Mankind", "Information", "Propaganda", "Cooking", "Consent", "Victory", "Lusciousness", "Smugness", "Viscosity", "Celebration", "Honor", "Shadows", "Mystery", "Comfort", "Ease", "Mastery", "Greatness", "Excellence", "Tautology, Redundancy, and Prolixity", "Skills", "Powers", "Nightmares", "Contemplation", "Agitation", "Administration", "Guidance", "Nakedness", "Nudity", "Humor", "Vision", "Hearing", "Smell", "Listening", "Napping", "Laughter", "Summer", "Winter", "Spring", "Fall", "Autumn", "Monday", "Romance", "Music", "Dance", "Fun", "Good Times", "Bad Times", "Combat", "Retreat", "Snuggles", "Cuddles", "Intercourse", "Conversation", "Domination", "Occupation", "Navigation", "Path-finding", "Searching", "Detection", "Friendship", "Hatred", "Misery", "Depression", "Fury", "Frenzy", "Rage", "Coronation", "Circumstance", "Nonsense", "Babbling", "Medicine", "Cheese", "Ennui", "Appreciation", "Sincerity", "Harmony", "Peace", "Agriculture", "Imagination", "Triumph"};
    public String concepts[] = new String[] {"Hunger", "Thirst", "Yearning", "Desire", "Passion", "Lust", "Incongruity", "Madness", "Insanity", "Love", "Confusion", "Randomization", "Meditation", "Evocation", "Apparition", "Transmutation", "Conjuration", "Necromancy", "Generation", "Incantation", "Stealth", "Glory", "Worthiness", "Imbalance", "Purpose", "Passage", "Modern Times", "Destruction", "Migration", "Wrath", "Anger", "Vengeance", "Justice", "Freedom", "Punishment", "Damnation", "Employment", "Gluttony", "Sacrifice", "Abilities", "Nature", "Disease", "Mankind", "Information", "Propaganda", "Cooking", "Consent", "Victory", "Lusciousness", "Smugness", "Viscosity", "Celebration", "Honor", "Shadows", "Mystery", "Comfort", "Ease", "Mastery", "Greatness", "Excellence", "Tautology, Redundancy, and Prolixity", "Skills", "Powers", "Nightmares", "Contemplation", "Agitation", "Administration", "Guidance", "Nakedness", "Nudity", "Humor", "Vision", "Hearing", "Smell", "Listening", "Napping", "Laughter", "Summer", "Winter", "Spring", "Fall", "Autumn", "Monday", "Romance", "Music", "Dance", "Fun", "Good Times", "Bad Times", "Combat", "Retreat", "Snuggles", "Cuddles", "Intercourse", "Conversation", "Domination", "Occupation", "Navigation", "Pathfinding", "Searching", "Detection", "Friendship", "Hatred", "Misery", "Depression", "Fury", "Frenzy", "Rage", "Coronation", "Circumstance", "Nonsense", "Babbling", "Medicine", "Cheese", "Ennui", "Appreciation", "Sincerity", "Harmony", "Peace", "Agriculture", "Imagination", "Triumph"};
    public String noConcepts[] = new String[] {"Knight", "Lord", "Lady", "King", "Duke", "Duchess", "Baron", "Princess", "Prince", "Queen", "Baroness", "Magister", "Magistrix", "Master", "Mistress", "Commander", "Captain", "Administrator", "Doctor", "Punk", "Lawyer", "Hero", "Dude", "Jerk", "Wizard", "President", "Prime Minister", "Speaker", "Vice President", "Congressman", "Senator", "Slave", "Officer", "Dispatcher", "Theif", "Prisoner", "Assassin", "Criminal", "Chef", "Father", "Mother", "Sister", "Brother", "Aunt", "Uncle", "Janitor", "Niece", "Nephew", "Champion", "Judge", "Citizen", "Scientist", "CEO", "Vendor", "Cat", "Mouse", "Rat", "Vermin", "Insect", "Beetle", "Bees", "Wasp", "Worm", "Maggot", "Zombie", "Dragon", "Griffon", "Manticore", "Ghoul", "Lich", "Arch Lich", "Ghost", "Skeleton", "Spider", "Hunter", "Killer", "Mage", "Hedge Mage", "Archmage", "Scholar", "Engineer", "Arcanist", "Gladiator", "Gladiatrix", "Necromancer", "Ne'er-do-well", "Magistrate", "Fairy", "Goblin", "Land Shark", "Kitten", "Dog", "Puppy", "Hound", "Wolf", "Tiger", "Lion", "Wildebeest", "Eagle", "Elephant", "Gopher", "Rhino", "Fox", "Dreadnaught", "Juggernaut", "Man", "Woman", "Human", "Child", "Person", "Chameleon", "Albatross", "Shark", "Jellyfish", "Fool", "Dummy", "Doofus", "Genius", "Owl", "Pigeon", "Snake", "Cobra", "Hamster", "Leopard", "Horse", "Salamander", "Hedgehog", "Echidna", "Squirrel", "Alien", "Buffalo", "Beaver", "Dolphin", "Preacher", "Concubine", "Laddy", "Dwarf", "Elf", "Troll", "Idiot", "Berserker", "Moose", "Goose", "Mummy", "Spectre", "Thug", "Dragonfly", "Kobold", "Watcher", "Penguin", "Glutton", "Businessman", "Businesswoman", "Police Officer", "Secret Agent", "Bear", "Grizzly", "Wombat", "Pony", "Donkey", "Monkey", "Gorilla", "Hummingbird", "Chimpanzee", "Tentacle", "Rapper", "Singer", "Dancer", "Artist", "Painter", "Writer", "Moron", "Lunatic", "Clerk", "Field", "Demon", "Devil", "Angel", "Athlete", "Wrestler", "Grandmaster", "Locksmith", "Anarchist", "Loser", "Winner", "Duck", "Salesman", "Gibbon", "Cross-dresser", "Puppeteer", "Lizard", "Anaconda", "Tarantula", "Scorpion", "Bat", "Serf", "Centipede", "People", "Blaster", "Game", "Puzzle", "Whip", "Flail", "Zweihander", "Cannon", "Gun", "Goblet", "Prayer", "Shout", "Scream", "Bell", "Apple", "Cucumber", "Mint", "Candy", "Knife", "Spike", "Bridge", "Ladder", "Hole", "Pit", "Portal", "Gate", "Door", "Fence", "Wall", "Egg", "Sun", "Moon", "Stars", "Airplane", "Helicopter", "Number", "Curse", "Butt", "Party", "Beer", "Wine", "Liquor", "Vodka", "Kiwi", "Strawberry", "Brick", "Hotdog", "Sausage", "Ear", "Arm", "Foot", "Leg", "Head", "Eye", "Nose", "Crotch", "Boat", "Ark", "Computer", "Vidya", "Leotard", "Piano", "Harp", "Trumpet", "Xylophone", "Cupcake", "Brownie", "Yogurt", "Pad", "Mask", "Hat", "Gloves", "Pants", "Helmet", "Gauntlets", "Chips", "Box", "Phone", "Massacre", "Tent", "Nail", "Jail", "Topic", "Wilderness", "Attack", "Fraud", "End Times", "Ink", "Armageddon", "Drugs", "Chair", "Machine", "Showdown", "Illusion", "Thing", "Thingy", "Equipment", "Armor", "Shield", "Sword", "Mace", "Hammer", "Spear", "Wotsit", "Button", "Question", "Omen", "Sign", "Tree", "Bushes", "Chariot", "Balls", "Couch", "Train", "Kaboose", "Tank", "Tankard", "Stein", "Urn", "Mafia", "Ruse", "Hamburger", "Recliner", "Cheeseburger", "Spaghetti", "Meat", "Vegetable", "Potato", "Pencil", "Goggles", "Widgit", "Rampage", "Dream", "Day and Age", "Facility", "Laboratory", "Tundra", "Mountain", "Forest", "Skies", "Space", "Party", "Gym", "Passage", "Hells", "Heavens", "Hill", "Territory", "Country", "World", "Globe", "Workshop", "Kingdom", "Swamp", "Plain", "Island", "Ocean", "Lake", "River", "Stream", "Meadow", "Field", "Wood", "Glade", "Copse", "Orchard", "City", "Town", "Suburb", "Burg", "Countryside", "Shelter", "Volcano", "Factory", "Corporation", "Capitol", "College", "School", "Taiga", "Ravine", "Marsh", "Desert", "Office", "Bunker", "Complex", "Mall", "Hospital", "Mental Ward", "Bedroom", "Bathroom", "Kitchen", "Civilization", "Society", "Closet", "Garage", "Pit", "Hole", "Fissure", "Valley", "Park", "Foothills", "Cave", "Arctic", "Blast", "Explosion", "Cone", "Sphere", "Cube", "Zone", "Area", "String", "Matrix", "Bolt", "Illusion", "Lace", "Heap", "Beam", "Laser", "Fireball", "Burst", "Splurt", "Lance", "Wave", "Ripple", "Concussion", "Epicentre", "Impact", "Strike", "Lattice", "Orb", "Target", "Mark", "Seal", "Binding"};
    public String entities[] = new String[] {"Knight", "Lord", "Lady", "King", "Duke", "Duchess", "Baron", "Princess", "Prince", "Queen", "Baroness", "Magister", "Magistrix", "Master", "Mistress", "Commander", "Captain", "Administrator", "Doctor", "Punk", "Lawyer", "Hero", "Dude", "Jerk", "Wizard", "President", "Prime Minister", "Speaker", "Vice President", "Congressman", "Senator", "Slave", "Officer", "Dispatcher", "Theif", "Prisoner", "Assassin", "Criminal", "Chef", "Father", "Mother", "Sister", "Brother", "Aunt", "Uncle", "Janitor", "Niece", "Nephew", "Champion", "Judge", "Citizen", "Scientist", "CEO", "Vendor", "Cat", "Mouse", "Rat", "Vermin", "Insect", "Beetle", "Bees", "Wasp", "Worm", "Maggot", "Zombie", "Dragon", "Griffon", "Manticore", "Ghoul", "Lich", "Arch Lich", "Ghost", "Skeleton", "Spider", "Hunter", "Killer", "Mage", "Hedge Mage", "Archmage", "Scholar", "Engineer", "Arcanist", "Gladiator", "Gladiatrix", "Necromancer", "Ne'er-do-well", "Magistrate", "Fairy", "Goblin", "Land Shark", "Kitten", "Dog", "Puppy", "Hound", "Wolf", "Tiger", "Lion", "Wildebeest", "Eagle", "Elephant", "Gopher", "Rhino", "Fox", "Dreadnought", "Juggernaut", "Man", "Woman", "Human", "Child", "Person", "Chameleon", "Albatross", "Shark", "Jellyfish", "Fool", "Dummy", "Doofus", "Genius", "Owl", "Pigeon", "Snake", "Cobra", "Hamster", "Leopard", "Horse", "Salamander", "Hedgehog", "Echidna", "Squirrel", "Alien", "Buffalo", "Beaver", "Dolphin", "Preacher", "Concubine", "Laddy", "Dwarf", "Elf", "Troll", "Idiot", "Berserker", "Moose", "Goose", "Mummy", "Spectre", "Thug", "Dragonfly", "Kobold", "Watcher", "Penguin", "Glutton", "Businessman", "Businesswoman", "Police Officer", "Secret Agent", "Bear", "Grizzly", "Wombat", "Pony", "Donkey", "Monkey", "Gorilla", "Hummingbird", "Chimpanzee", "Tentacle", "Rapper", "Singer", "Dancer", "Artist", "Painter", "Writer", "Moron", "Lunatic", "Clerk", "Field", "Demon", "Devil", "Angel", "Athlete", "Wrestler", "Grandmaster", "Locksmith", "Anarchist", "Loser", "Winner", "Duck", "Salesman", "Gibbon", "Cross-dresser", "Puppeteer", "Lizard", "Anaconda", "Tarantula", "Scorpion", "Bat", "Serf", "Centipede"};
    public String adjectives[] = new String[] {"Gobletty", "Fiery", "Excellent", "Wooden", "Plastic", "Stone", "Rubber", "Steel", "Iron", "Obsidian", "Silver", "Golden", "Bloody", "Nightmarish", "Horrifying", "Lovely", "Beautiful", "Amazing", "Superb", "Nice", "Okay", "Azure", "Ruby", "Emerald", "Damp", "Dry", "Thirsty", "Hungry", "Angry", "Furious", "Extreme", "Supreme", "Optimal", "Suboptimal", "Chunky", "Fat", "Sloppy", "Clean", "Robust", "Skeletal", "Stupid", "Ridiculous", "Insane", "Crazy", "Co-Co-Nuts", "Grand", "Majestic", "Hazy", "Frosty", "Flaming", "Burning", "Electric", "Electrified", "New", "Old", "Ancient", "Unheard-of", "Unknown", "Notorious", "Shameful", "Prideful", "Straight", "Narrow", "Wiggly", "Tilted", "Cromulent", "Euphoric", "Delightful", "Delighted", "Great", "Palatial", "Loud", "Quiet", "Relaxed", "Twitchy", "Awful", "Sweet", "Sour", "Bitter", "Tangy", "Dirty", "Filthy", "Masterful", "Red", "Green", "Yellow", "Blue", "Black", "White", "Crunchy", "Soft", "Hard", "Cold", "Wet", "Dusty", "Forgotten", "Friendly", "Grandiose", "Hidden", "Stealthy", "Extravagant", "Animalistic", "Wrathful", "Lusty", "Greedy", "Hateful", "Loving", "Ghostly", "Zombified", "Truncated", "Random", "Inappropriate", "Appropriate", "Problematic", "Unprofessional", "Professional", "Aromatic", "Interesting", "Busted", "Bogus", "Chinese", "Elven", "Dwarven", "Earthen", "Mouldy", "Colorful", "Sinister", "Obvious", "Secret", "Wonderful", "Donked", "Conked", "Screaming", "Howling", "Singing", "Dancing", "Musical", "Painful", "Erotic", "Spiny", "Gross", "Unpleasant", "Bifurcated", "Lewd", "Special", "Tinted", "Sick", "Circular", "Leaning", "Comical", "Worthy", "Peculiar", "Strange", "Informative", "Super", "Incoming", "Fluid", "Liquid", "Delicious", "Gainful", "Growing", "Imaginary", "Illusory", "Ethereal", "Fake", "Real", "Suspicious", "Meh", "Ultra", "Ultimate", "Tasty", "Elder", "Clever", "Slimy", "American", "Mexican", "Japanese", "British", "French", "German", "Sly", "Cunning", "Kind", "Cute", "Ugly", "Warty", "Stinky", "Farty", "Young", "Naive", "Experienced", "Heroic", "Cowardly", "Chivalrous", "Mysterious", "Creepy", "2 Cool", "Cool", "Radical", "Boring", "Irritating", "Social", "Anti-Social", "Lustful", "Passionate", "Thoughtful", "Thoughtless", "Lonely", "Lazy", "Jerky", "Worthless", "Radioactive", "Shiny", "Obsessive", "Sleepy", "Feline", "Jazzy", "Strident", "Preachy", "Transgender", "Hypocrite", "Unassuming", "Uninteresting", "Bizarre", "Weirdo", "Normal", "Religious", "Racist", "Rotund", "Thin", "Skinny", "Busty", "Canine", "Equine", "Nosy", "Busy", "Florid", "Genius", "Wacky", "Awkward", "Smug", "Snooty", "Humble", "Good-Natured", "Crabby", "Ornery", "Patient", "Impatient", "Innocent", "Crotchety", "Oblivious", "Self-Aware", "Disillusioned", "Clumsy", "Balanced", "Adroit", "Adept", "Inept", "Spooky", "Impoverished", "Rich", "Surprising", "Pudgy", "Hollow", "Vampiric", "Lupine", "Bushy", "Hirsute", "Forgetful", "Vengeful", "Forgiving", "Irritable", "Meditative", "Panicked", "Incredulous", "Fabulous", "Murderous", "Mithril", "Tainted", "Aquamarine", "Soaked", "Heavy", "Light", "Bad", "Good"};
    public String traits[] = new String[] {"Sly", "Cunning", "Loving", "Kind", "Sweet", "Cute", "Beautiful", "Hungry", "Fat", "Ugly", "Warty", "Stinky", "Farty", "Old", "Young", "Naive", "Experienced", "Heroic", "Cowardly", "Chivalrous", "Mysterious", "Creepy", "2 Cool", "Cool", "Radical", "Boring", "Irritating", "Social", "Anti-Social", "Greedy", "Lustful", "Passionate", "Hateful", "Thoughtful", "Thoughtless", "Lonely", "Loud", "Lazy", "Jerky", "Worthless", "Amazing", "Radioactive", "Shiny", "Clean", "Obsessive", "Insane", "Sleepy", "Feline", "Jazzy", "Musical", "Strident", "Preachy", "Quiet", "Wrathful", "Transgender", "Hypocrite", "Elven", "Dwarven", "Unassuming", "Uninteresting", "Interesting", "Bizarre", "Weirdo", "Normal", "Religious", "Racist", "Rotund", "Thin", "Skinny", "Busty", "Canine", "Equine", "Nosy", "Busy", "Florid", "Stupid", "Genius", "Wacky", "Awkward", "Smug", "Snooty", "Humble", "Good-Natured", "Crabby", "Ornery", "Patient", "Impatient", "Lovely", "Sinister", "Innocent", "Crotchety", "Oblivious", "Self-Aware", "Disillusioned", "Clumsy", "Balanced", "Adroit", "Adept", "Inept", "Spooky", "Impoverished", "Rich", "Surprising", "Ethereal", "Pudgy", "Hollow", "Vampiric", "Lupine", "Bushy", "Hirsute", "Forgetful", "Vengeful", "Forgiving", "Irritable", "Relaxed", "Meditative", "Panicked", "Incredulous", "Fabulous", "Murderous"};
    public String verbs[] = new String[] {"Summon", "Control", "Banish", "Destroy", "Create", "Unleash", "Dominate", "Grind", "Grasp", "Levitate", "Teleport", "Transmute", "Evoke", "Conjure", "Prestidigitate", "Explode", "Detonate", "Liquify", "Solidify", "Imagine", "Cook", "Prepare", "Escape", "Paint", "Discuss", "Remember", "Exhaust", "Spook", "Horrify", "Scare", "Delight", "Astound", "Call", "Entertain", "Arouse", "Wow", "Seduce", "Attack", "Defend", "Inform", "Bore", "Electrocute", "Freeze", "Burn", "Upgrade", "Evolve", "Activate", "Sacrifice", "Preserve", "Identify", "Examine", "Include", "Frighten", "Flap", "Collect", "Rescue", "Wrestle", "Approve", "Sniff", "Annoy", "Avoid", "Doubt", "Hug", "Kiss", "Love", "Admire", "Guard", "Ban", "Cheat", "Smell", "Stretch", "Marry", "Influence", "Fool", "Practice", "Grease", "Borrow", "Bury", "Dispell", "Trip", "Choke", "Crack", "Prevent", "Recieve", "Mourn", "Beg", "Confuse", "Harass", "Instruct", "Separate", "Befuddle", "Squeeze", "Juice", "Smash", "Bash", "Crush", "Envelop", "Camouflage", "Heat", "Educate", "Snatch", "Fry", "Zap", "Sizzle", "Squelch", "Counter"};
    public String connectors[] = new String[] {"of", "of the"};
    public String quests[] = new String[] {"I spent too many hours creating my last spell and I don't know how to explain it on my timescroll.", "I've got tangles in my beard. Help me out!", "I want to take a beautiful young lady out on the town, but I'm an old geezer and the woods are filled with bears.", "Spell Explorer 8 on my Wizards 7 machine is frozen and I want to check the interwebz.", "I want to divorce my wizard-wife.", "There's a shelter that needs to give away 100 puppies to good homes!", "My cat has fleas.", "Everyone in town thinks I'm a weird old geezer. Won't you help me show them reason?", "My mother-witch-in-law is coming over and I forgot to clean up the spire.", "I dared someone I would hold down 100 bananas and I don't even want to try. Help me out.", "I'm at the shoe-store and none of their shoes are big enough.", "There's a horde of attention-deficit monkeys attacking downtown.", "I'm hungry.", "An Ancient Black Dragon is destroying one of of favorite fiefdoms! If you could sort that out, it'd be great.", "Goblins stole all the ale, and the party starts in just 1 Minute!", "The vicious Orcs to the south worship a Golden Idol which would look great in my bathroom. Do what needs to be done."};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wizard);

        final TextView spellView1=(TextView)findViewById(R.id.wizSpell1);
        final TextView spellView2=(TextView)findViewById(R.id.wizSpell2);
        final TextView spellView3=(TextView)findViewById(R.id.wizSpell3);
        final TextView spellView4=(TextView)findViewById(R.id.wizSpell4);
        final TextView spellView5=(TextView)findViewById(R.id.wizSpell5);
        final TextView questView=(TextView)findViewById(R.id.questView);
        final TextView wizardName=(TextView)findViewById(R.id.wizardName);
        final TextView wizardTraits=(TextView)findViewById(R.id.wizardTraits);
        final Button generateButton =  (Button)findViewById(R.id.questButton);
        final Button rerollButton =  (Button)findViewById(R.id.rerollBtn);
        final Button okayButton =  (Button)findViewById(R.id.okayBtn);
        final Button spellButton1 =  (Button)findViewById(R.id.spellButton1);
        final Button spellButton2 =  (Button)findViewById(R.id.spellButton2);
        final Button spellButton3 =  (Button)findViewById(R.id.spellButton3);
        final Button spellButton4 =  (Button)findViewById(R.id.spellButton4);
        final Button spellButton5 =  (Button)findViewById(R.id.spellButton5);

                spellView1.setText(generateSpell(spellView1));
                spellView2.setText(generateSpell(spellView2));
                spellView3.setText(generateSpell(spellView3));
                spellView4.setText(generateSpell(spellView4));
                spellView5.setText(generateSpell(spellView5));

        generateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                questView.setText(generateQuest(v));
            }         });

        rerollButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spellView1.setText(generateSpell(v));
                spellView2.setText(generateSpell(v));
                spellView3.setText(generateSpell(v));
                spellView4.setText(generateSpell(v));
                spellView5.setText(generateSpell(v));
            }         });

        okayButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                wizardName.setText(generateName(v));
                wizardTraits.setText(generateTraits(v));
                View view = findViewById(R.id.wizNameLayout);
                view.setVisibility(View.VISIBLE);
                view = findViewById(R.id.questButtonBorder);
                view.setVisibility(View.VISIBLE);
                view = findViewById(R.id.rerollBtnBorder);
                view.setVisibility(View.GONE);
                view = findViewById(R.id.okayBtnBorder);
                view.setVisibility(View.GONE);
            }         });

/*        spellButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                View view = findViewById(R.id.spell1Layout);

                int currentColor = Color.TRANSPARENT;
                Drawable background = view.getBackground();
                if (background instanceof ColorDrawable)
                    currentColor = ((ColorDrawable) background).getColor();

                switch (currentColor){
                    case -1056583:
                        //if default, change to red
                        view.setBackgroundColor(Color.parseColor("#FF0000"));
                        break;
                    case -65536:
                        //if red, change to green
                        view.setBackgroundColor(Color.parseColor("#00FF00"));
                        break;
                    case -16711936:
                        //if green, change to default
                        view.setBackgroundColor(Color.parseColor("#EFE0B9"));
                        break;
                    default:
                        //if none of these, change to default
                        break;
                }

            }
        });*/
    }

    private String generateQuest(View view) {
        String mainQuest = newMainQuest();
        return mainQuest;
    }

    private String generateTraits (View view) {
        String trait1 = newTrait1();
        String trait2 = newTrait2();
        String trait3 = newTrait3();
        if ((trait3 == trait2 || trait3 == trait1) && trait2 != trait1){
            return trait1 + ", " + trait2;
        }
        else if (trait2 == trait1 && trait3 == trait1){
            return trait1;
        }
        else if (trait2 == trait1 && trait3 != trait1){
            return trait1 + ", " + trait3;
        }
        else {
            return trait1 + ", " + trait2 + ", " + trait3;
        }
    }

    private String generateName(View view) {
        String firstName1 = newFirstName1();
        String lastName1 = newLastName1();
        String entity1 = newEntity1();
        String noun1 = newNoun1();
        String adjective1 = newAdjective1();
        String connector1 = newConnector1();

        int nameComplexitySelector;
        Random randomGenerator = new Random();
        nameComplexitySelector = 1 + randomGenerator.nextInt(13);
        switch (nameComplexitySelector) {
            case 1:
                return firstName1;
            case 2:
                return firstName1 + " " + lastName1;
            case 3:
                return adjective1 + " " + lastName1;
            case 4:
                return adjective1 + " " + firstName1;
            case 5:
                return firstName1 + " " + connector1 + " " + noun1;
            case 6:
                return firstName1 + " the " + adjective1;
            case 7:
                return firstName1 + " the " + noun1;
            case 8:
                return entity1 + " " + lastName1;
            case 9:
                return lastName1 + ": " + entity1;
            case 10:
                return adjective1 + " " + entity1 + " " + lastName1;
            case 11:
                return adjective1 + " " + entity1 + " " + lastName1;
            case 12:
                return firstName1 + " " + lastName1;
            case 13:
                return entity1 + " " + lastName1;
            default:
                break;
        }
        return "Oops";
    }

    public String generateSpell(View view){
//switch and case statements here to randomize
        String noun1 = newNoun1();
        String noun2 = newNoun2();
        String noun3 = newNoun3();
        String firstName1 = newFirstName1();
        String lastName1 = newLastName1();
        String concept1 = newConcept1();
        String concept2 = newConcept2();
        String noConcept1 = newNoConcept1();
        String noConcept2 = newNoConcept2();
        String entity1 = newEntity1();
        String entity2 = newEntity2();
        String adjective1 = newAdjective1();
        String adjective2 = newAdjective2();
        String trait1 = newTrait1();
        String trait2 = newTrait2();
        String trait3 = newTrait3();
        String verb1 = newVerb1();
        String verb2 = newVerb2();
        String verb3 = newVerb3();

        int spellComplexitySelector;
        Random randomGenerator = new Random();
        spellComplexitySelector = 1 + randomGenerator.nextInt(41);
        switch (spellComplexitySelector) {
            case 1:
                return noun1 + "!";
            case 2:
                return verb1 + " " + noun1;
            case 3:
                return verb1 + " and " + verb2;
            case 4:
                return concept1 + " " + noConcept1;
            case 5:
                return noun1 + " " + noun2;
            case 6:
                return noun1 + " of " + concept1;
            case 7:
                return noun1 + " of the " + noConcept1;
            case 8:
                return adjective1 + " " + noun1;
            case 9:
                return verb1 + " " + adjective1 + " " + noun1;
            case 10:
                return verb1 + ", " + verb2 + ", and then " + verb3 + "!";
            case 11:
                return adjective1 + " " + noun1 + " " + noun2;
            case 12:
                return noun1 + "! " + noun1 + "! " + noun1 + "!";
            case 13:
                return adjective1 + " " + noun1 + " of " + concept1;
            case 14:
                return noun1 + " of " + adjective1 + " " + concept1;
            case 15:
                return adjective1 + " " + noun1 + " of the " + noConcept1;
            case 16:
                return noun1 + " of the " + adjective1 + " " + noConcept1;
            case 17:
                return adjective1 + " " + adjective2 + " " + noun1;
            case 18:
                return adjective1 + " " + noConcept1 + " " + noun1;
            case 19:
                return firstName1 + "\'s " + verb1 + " " + noun1;
            case 20:
                return firstName1 + "\'s " + noun1 + " of the " + noConcept1;
            case 21:
                return entity1 + "\'s " + verb1 + " and " + verb2;
            case 22:
                return entity1 + "\'s " + adjective1 + " " + noun1;
            case 23:
                return verb1 + " and " + verb2 + " " + adjective1 + " " + noConcept1;
            case 24:
                return verb1 + " " + adjective1 + " " + noConcept1 + " " + noConcept2;
            case 25:
                return adjective1 + " " + noun1 + " and " + adjective2 + " " + noun2;
            case 26:
                return adjective1 + " " + noun1 + " of " + adjective2 + " " + concept1;
            case 27:
                return adjective1 + " " + noun1 + " of the " + adjective2 + " " + noConcept1;
            case 28:
                return adjective1 + " " + noConcept1 + ", " + adjective2 + " " + noun1;
            case 29:
                return firstName1 + "\'s " + adjective1 + " " + adjective2 + " " + noun1;
            case 30:
                return firstName1 + "\'s " + verb1 + " " + adjective1 + " " + noun1;
            case 31:
                return firstName1 + "\'s " + noun1 + " of " + adjective1 + " " + concept1;
            case 32:
                return adjective1 + " " + entity1 + "\'s " + noun1 + " of " + concept1;
            case 33:
                return firstName1 + " " + lastName1 + "\'s " + noun1 + " " + noun2;
            case 34:
                return adjective1 + " " + concept1 + " " + noConcept1 + " of " + verb1 + " and " + verb2;
            case 35:
                return verb1 + " " + adjective1 + " " + noConcept1 + " and " + adjective2 + " " + noConcept2;
            case 36:
                return adjective1 + "-" + adjective1 + "-" + adjective1 + " " + adjective2 + " " + noun1;
            case 37:
                return adjective1 + " " + concept1 + " of the " + adjective2 + " " + noConcept1 + " " + noConcept2;
            case 38:
                return adjective1 + " " + entity1 + "\'s " + verb1 + ", " + verb2 + ", and then " + verb3 + "!";
            case 39:
                return adjective1 + " " + entity1 + "'s " + adjective2 + " " + noun1 + " of " + concept1;
            case 40:
                return lastName1 + "\'s " + verb1 + " and " + verb2 + " " + adjective1 + " " + noConcept1;
            case 41:
                return firstName1 + " " + lastName1 + "\'s " + verb1 + " " + adjective1 + " " + noConcept1;
            default:
                break;
        }
        return "Oops";
    }

    public String newFirstName1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(firstName.length);
        return firstName[x];
    }

    public String newMainQuest(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(quests.length);
        return quests[x];
    }

    public String newLastName1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(lastName.length);
        return lastName[x];
    }
    public String newVerb1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(verbs.length);
        return verbs[x];
    }

    public String newVerb2(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(verbs.length);
        return verbs[x];
    }

    public String newVerb3(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(verbs.length);
        return verbs[x];
    }

    public String newNoun1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(nouns.length);
        return nouns[x];
    }

    public String newNoun2(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(nouns.length);
        return nouns[x];
    }

    public String newNoun3(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(nouns.length);
        return nouns[x];
    }

    public String newAdjective1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(adjectives.length);
        return adjectives[x];
    }

    public String newAdjective2(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(adjectives.length);
        return adjectives[x];
    }

    public String newAdjective3(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(adjectives.length);
        return adjectives[x];
    }

    public String newConnector1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(connectors.length);
        return connectors[x];
    }

    public String newTrait1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(traits.length);
        return traits[x];
    }
    public String newTrait2(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(traits.length);
        return traits[x];
    }
    public String newTrait3(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(traits.length);
        return traits[x];
    }
    public String newConcept1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(concepts.length);
        return concepts[x];
    }

    public String newConcept2(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(concepts.length);
        return concepts[x];
    }

    public String newNoConcept1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(noConcepts.length);
        return noConcepts[x];
    }

    public String newNoConcept2(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(noConcepts.length);
        return noConcepts[x];
    }
    public String newEntity1(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(entities.length);
        return entities[x];
    }

    public String newEntity2(){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(entities.length);
        return entities[x];
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_wizard, container, false);
            return rootView;
        }
    }
}
