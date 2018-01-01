import React from 'react';

import PropTypes from 'prop-types';
import LoginForm from '../components/LoginForm.jsx';

import $ from 'jquery-ajax';

class LoginPage extends React.Component {

    /**
     * Class constructor.
     */
    constructor(props) {
        super(props);

        // set the initial component state
        this.state = {
            errors: {},
            user: {
                email: '',
                password: ''
            }
        };

        this.processForm = this.processForm.bind(this);
        this.changeUser = this.changeUser.bind(this);
    }

    /**
     * Process the form.
     *
     * @param {object} event - the JavaScript event object
     */
    processForm(event) {
        // prevent default action. in this case, action is the form submission event
        event.preventDefault();

        // create a string for an HTTP body message
        const formData = {username: this.state.user.email, password: this.state.user.password};
        console.log("User state: " + this.state.user);
        const loginURL = 'http://localhost:8080/login/';

        // create an AJAX request
        // create an AJAX request
        $.ajax({
            type: 'POST',
            url: loginURL,
            data: JSON.stringify(formData),
            dataType: 'json',
            contentType: 'application/json',
            cache: false,
            success: function(data) {
                this.setState({errors:{}});
                console.log("Form is valid");
            }.bind(this),
            error: function(xhr, status, err) {
                this.setState({errors: {err}});
                console.log(loginURL, status, err.message);
            }.bind(this)
        })
    }

    /**
     * Change the user object.
     *
     * @param {object} event - the JavaScript event object
     */
    changeUser(event) {
        const field = event.target.name;
        const user = this.state.user;
        user[field] = event.target.value;

        this.setState({
            user
        });
    }

    /**
     * Render the component.
     */
    render() {
        return (
            <LoginForm
                onSubmit={this.processForm}
                onChange={this.changeUser}
                errors={this.state.errors}
                user={this.state.user}
            />
        );
    }

}

export default LoginPage;