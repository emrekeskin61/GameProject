
public class GameManager implements GameService {

	@Override
	public void campaing(Campaign campaing, Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+"Adl� oyunda yeni kampanya=>"+campaing.getCampaignName()+"Kampanyas�yla");
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " Eklendi");
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " G�ncellendi");
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " Silindi");
	}

}
