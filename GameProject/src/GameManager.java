
public class GameManager implements GameService {

	@Override
	public void campaing(Campaign campaing, Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName()+"Adlı oyunda yeni kampanya=>"+campaing.getCampaignName()+"Kampanyasıyla");
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " Eklendi");
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " Güncellendi");
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() + " Silindi");
	}

}
