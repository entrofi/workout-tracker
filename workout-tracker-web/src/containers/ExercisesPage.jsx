import React from 'react';

import PropTypes from 'prop-types';
import LoginForm from '../components/CreateExercise.jsx';

import $ from 'jquery-ajax';


class ExercisesPage extends React.Component {
    constructor(props) {
        super(props);
        //set initial component state
        this.state = {
            errors: {},
            exercise: {
                name: '',
                description: '',
                targets: []
            },
            exercises: []
        };
        this.processForm = this.processForm.bind(this);
    }



    processForm(event) {
        var self = this;
        //prevent default action.
        event.preventDefault();
        const exerciseFormData = {
            name: this.state.exercise.name,
            description: this.state.exercise.description,
            targets: this.state.exercise.targets
        };

        const createExerciseURL = 'http://localhost:8080/api/exercises';

        // create an AJAX request
        $.ajax({
            type: 'POST',
            url: createExerciseURL,
            data: JSON.stringify(createExerciseURL),
            dataType: 'json',
            contentType: 'application/json',
            cache: false,
            success: function(data) {
                this.setState({errors:{}});
                console.log("Form is valid");
                self.props.history.push('/');
            }.bind(this),
            error: function(xhr, status, err) {
                this.setState({errors: {err}});
                console.log(createExerciseURL, status, err.message);
            }.bind(this)
        });
    }

    render() {
        return (
            <div>
                <CreateExercise></CreateExercise>
            </div>
        );
    }
}

export default ExercisesPage;