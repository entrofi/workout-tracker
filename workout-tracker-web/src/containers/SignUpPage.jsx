import React from 'react';

import PropTypes from 'prop-types';
import SignUpForm from '../components/SignUpForm.jsx';

import $ from 'jquery-ajax';


class SignUpPage extends React.Component {


    /**
     * Class constructor.
     */
    constructor(props) {
        super(props);
        // set the initial component state
        this.state = {
            errors: {},
            user: {
                username: '',
                email: '',
                firstname: '',
                lastname: '',
                password: ''
            }
        };

        this.processForm = this.processForm.bind(this);
        this.changeUser = this.changeUser.bind(this);
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
     * Process the form.
     *
     * @param {object} event - the JavaScript event object
     */
    processForm(event) {
        const self = this;
        // prevent default action. in this case, action is the form submission event
        event.preventDefault();
        // create a string for an HTTP body message
        const formData = {
            username: this.state.user.username,
            email: this.state.user.email,
            firstname: this.state.user.firstname,
            lastname: this.state.user.lastname,
            password: this.state.user.password
        };
        const signupURL = 'http://localhost:8080/auth/signup'

        // create an AJAX request
        $.ajax({
            type: 'POST',
            url: signupURL,
            data: JSON.stringify(formData),
            contentType: 'application/json',
            cache: false,
            crossDomain: true,
            success: function(data) {
                this.setState({errors:{}});
                localStorage.setItem('successMessage', data);
                self.props.history.push('/login');
            }.bind(this),
            error: function(xhr, status, err) {
                this.setState({errors: {err}});
                console.log(signupURL, status, err.message);
            }.bind(this)
        });
    }

    /**
     * Render the component.
     */
    render() {
        return (
            <SignUpForm
                onSubmit={this.processForm}
                onChange={this.changeUser}
                errors={this.state.errors}
                user={this.state.user}
            />
        );
    }

}

export default SignUpPage;
