package com.goodteacher.api.dto;

import com.goodteacher.api.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    // region Fields

    private UUID id;
    private String name;
    private String text;
    private String quiz;

    // endregion

    // region Methods

    public static TaskDTO toDTO(final Task task) {
        final TaskDTO taskDTO = new TaskDTO();

        taskDTO.setId(task.getId());
        taskDTO.setName(task.getName());
        taskDTO.setText(task.getText());
        taskDTO.setQuiz(task.getQuiz());

        return taskDTO;
    }

    // endregion
}
