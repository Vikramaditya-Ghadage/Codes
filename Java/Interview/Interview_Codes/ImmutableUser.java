import java.util.*;

record Person(String name, int age) {}  // in java 14 we use record word to make class imutable
// The compiler automatically generates the constructor, getters (name() and age()), and other useful methods.

public final class ImmutableUser {
    private final Long id;
    private final String name;
    private final List<String> roles;  // ✅ Defensive copy
    
    public ImmutableUser(Long id, String name, List<String> roles) {
        this.id = id;
        this.name = name;
        // ✅ DEEP COPY - critical!
        this.roles = roles != null ? new ArrayList<>(roles) : new ArrayList<>();
    }
    
    public List<String> getRoles() {
        return Collections.unmodifiableList(roles);
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    
}

