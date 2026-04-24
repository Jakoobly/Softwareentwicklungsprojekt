package gantt.model;

import java.time.LocalTime;
import java.util.List;

// Klasse für die Eigenschaften des Plans

public class Plan {
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final List<String> rowOrder;
    private final List<PlanObjekt> objects;

    public Plan(LocalTime startTime, LocalTime endTime, List<String> rowOrder, List<PlanObjekt> objects) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.rowOrder = rowOrder;
        this.objects = objects;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public List<String> getRowOrder() {
        return rowOrder;
    }

    public List<PlanObjekt> getObjects() {
        return objects;
    }
}