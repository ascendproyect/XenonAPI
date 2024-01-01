 We have made a new API that connects to our **Xenon** for
all of the external plugin creators!

Have questions? Please feel free to join our [support discord](https://ascendproyect.org/discord/) and
open a support ticket!

## API Usage
We have added many events, and will continue to add more!
If you need a specific event, and the API does not have the event, please join our [support discord](https://ascendproyect.org/discord/)
and tell us what new events you need!

All of our currently available usages are listed below:

```Java
public Profile getProfile(UUID uuid)
public String getTag(UUID uuid)
public boolean isStaffChat(UUID uuid)
public boolean isAdminChat(UUID uuid)
public Rank getRank(UUID uuid)
public List<Grant> getActiveGrants(UUID uuid)
public List<Grant> getAllGrants(UUID uuid)
public boolean isMuted(UUID uuid)
public boolean isBanned(UUID uuid)
public boolean isBlacklisted(UUID uuid)
public List<Punishment> getActivePunishments(UUID uuid)
public boolean isProfileDiscordSynced(UUID uuid)
public String getProfileDiscordUserID(UUID uuid)
public String getProfileDiscordName(UUID uuid)
public boolean isProfileOnline(UUID uuid)
public Squad getSquad(String squad_name) // WARNING: This returns 'null' if no squad is found with specified name.
public boolean isInSquad(UUID uuid)
public String getSquadName(UUID uuid)
public String getSquadRank(UUID uuid)
public int getSquadOnline(UUID uuid)
public int getSquadMembers(UUID uuid)
public List<Notification> getNotifications(UUID uuid)
```
