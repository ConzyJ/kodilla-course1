import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> filteredUsers = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')  // 🚹 Tylko mężczyźni
                .filter(user -> Period.between(user.getBirthDate(), LocalDate.now()).getYears() >= 20)  // 🎂 Min. 20 lat
                .filter(user -> user.getPostCount() > 0)  // 📝 Min. 1 post
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user)); // 📌 Mapowanie ID → ForumUser

        System.out.println("Filtered users:");
        filteredUsers.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
