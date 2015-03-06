
package thakur.rahul.colourmemory;

import thakur.rahul.colourmemory.controller.CardController;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GameBoard extends Activity {

	private CardController cardController;
	private boolean isFirstImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_board);
		cardController = new CardController(this);
		isFirstImage = true;
	}

	public void imageClick(View v) {

		if (isFirstImage) {
			cardController.firstImage((ImageView) v);
			isFirstImage = !isFirstImage;
		} else {
			cardController.checkForMatch((ImageView) v);
			isFirstImage = !isFirstImage;
		}
	}
}
