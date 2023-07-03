package sg.edu.rp.c346.id22005564.demodatabase;

import androidx.annotation.NonNull;

public class Task {
    private int id;
    private String description;
    private String date;

    public Task(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }
    @NonNull
    @Override
    public String toString() {
        return id + "\n" + description + "\n" + date;
    }
    public int getId() { return id; }

    public String getDescription() { return description; }

    public String getDate() { return date;}


}


