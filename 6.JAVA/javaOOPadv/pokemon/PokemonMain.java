package pokemon;

class PokemonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex p = new Pokedex();
		
		Pokemon poke1=p.createPokemon("poke1", 100, "Fuego");
		Pokemon poke2=p.createPokemon("poke2", 200, "Agua");
		Pokemon poke3=p.createPokemon("poke3", 200, "Agua");
		
		poke1.attackPokemon(poke2);
		
		System.out.println(p.pokemonInfo(poke1));
		System.out.println(p.pokemonInfo(poke2));
		
		System.out.println(Pokemon.getCount());
		
	}
}
