package relampagorojo93.LibsCollection.TwitchIRCBot.Data;

import java.util.Map;

public class RaidData extends Data {
	private int viewers;
	public RaidData(Map<String,String> tags, String channel, String executor, int viewers) {
		super(Action.RAID, tags, channel, executor);
		this.viewers = viewers;
	}
	public int getViewers() {
		return viewers;
	}

}
